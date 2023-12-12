/**
 * @format
 */

import {AppRegistry} from 'react-native';
import App from './App';
import {name as appName} from './app.json';
import {
  Platform,
  DeviceEventEmitter,
  NativeEventEmitter,
  NativeModules,
} from 'react-native';

export const {Mini} = NativeModules;
AppRegistry.registerComponent(appName, () => App);
// AppRegistry.registerComponent('mini2', () => Mini);
