import { hexToRgb } from './utils';
import { removeClass, getTopMargin, fadeIn, show, addClass } from './handle-dom';
import defaultParams from './default-params';

var modalClass   = '.sweet-alert';
var overlayClass = '.sweet-overlay';

/*
 * Add modal + overlay to DOM
 */
import injectedHTML from './injected-html';

var sweetAlertInitialize = function() {
  var sweetWrap = document.createElement('div');
  sweetWrap.innerHTML = injectedHTML;

  // Append elements to body
  while (sweetWrap.firstChild) {
    document.body.appendChild(sweetWrap.firstChild);
  }
};

/*
 * Get DOM element of modal
 */
var getModal = function() {
  var $uibModal = document.querySelector(modalClass);

  if (!$uibModal) {
    sweetAlertInitialize();
    $uibModal = getModal();
  }

  return $uibModal;
};

/*
 * Get DOM element of input (in modal)
 */
var getInput = function() {
  var $uibModal = getModal();
  if ($uibModal) {
    return $uibModal.querySelector('input');
  }
};

/*
 * Get DOM element of overlay
 */
var getOverlay = function() {
  return document.querySelector(overlayClass);
};

/*
 * Add box-shadow style to button (depending on its chosen bg-color)
 */
var setFocusStyle = function($button, bgColor) {
  var rgbColor = hexToRgb(bgColor);
  $button.style.boxShadow = '0 0 2px rgba(' + rgbColor + ', 0.8), inset 0 0 0 1px rgba(0, 0, 0, 0.05)';
};

/*
 * Animation when opening modal
 */
var openModal = function(callback) {
  var $uibModal = getModal();
  fadeIn(getOverlay(), 10);
  show($uibModal);
  addClass($uibModal, 'showSweetAlert');
  removeClass($uibModal, 'hideSweetAlert');

  window.previousActiveElement = document.activeElement;
  var $okButton = $uibModal.querySelector('button.confirm');
  $okButton.focus();

  setTimeout(function () {
    addClass($uibModal, 'visible');
  }, 500);

  var timer = $uibModal.getAttribute('data-timer');

  if (timer !== 'null' && timer !== '') {
    var timerCallback = callback;
    $uibModal.timeout = setTimeout(function() {
      var doneFunctionExists = ((timerCallback || null) && $uibModal.getAttribute('data-has-done-function') === 'true');
      if (doneFunctionExists) { 
        timerCallback(null);
      }
      else {
        sweetAlert.close();
      }
    }, timer);
  }
};

/*
 * Reset the styling of the input
 * (for example if errors have been shown)
 */
var resetInput = function() {
  var $uibModal = getModal();
  var $input = getInput();

  removeClass($uibModal, 'show-input');
  $input.value = defaultParams.inputValue;
  $input.setAttribute('type', defaultParams.inputType);
  $input.setAttribute('placeholder', defaultParams.inputPlaceholder);

  resetInputError();
};


var resetInputError = function(event) {
  // If press enter => ignore
  if (event && event.keyCode === 13) {
    return false;
  }

  var $uibModal = getModal();

  var $errorIcon = $uibModal.querySelector('.sa-input-error');
  removeClass($errorIcon, 'show');

  var $errorContainer = $uibModal.querySelector('.sa-error-container');
  removeClass($errorContainer, 'show');
};


/*
 * Set "margin-top"-property on modal based on its computed height
 */
var fixVerticalPosition = function() {
  var $uibModal = getModal();
  $uibModal.style.marginTop = getTopMargin(getModal());
};


export { 
  sweetAlertInitialize,
  getModal,
  getOverlay,
  getInput,
  setFocusStyle,
  openModal,
  resetInput,
  resetInputError,
  fixVerticalPosition
};
