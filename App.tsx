import React, {useState} from 'react';
import {
  Pressable,
  StyleSheet,
  Text,
  TouchableOpacity,
  View,
} from 'react-native';

import {
  Platform,
  DeviceEventEmitter,
  NativeEventEmitter,
  NativeModules,
} from 'react-native';

export const {Mini} = NativeModules;

function App(): JSX.Element {
  const [pre, setPre] = useState(false);
  const handlePress = () => {
    Mini.navigateToScreen();
    // Call the getName method with a callback
    Mini.getName(name => {
      console.log('pressed', name);
    });
  };
  return (
    <View>
      <Text style={styles.sectionTitle}>hello</Text>
      <Pressable>
        <Text onPress={handlePress}>
          Click here to open another React native
        </Text>
      </Pressable>
    </View>
  );
}

const styles = StyleSheet.create({
  sectionContainer: {
    marginTop: 32,
    paddingHorizontal: 24,
  },
  sectionTitle: {
    fontSize: 24,
    fontWeight: '600',
  },
  sectionDescription: {
    marginTop: 8,
    fontSize: 18,
    fontWeight: '400',
  },
  highlight: {
    fontWeight: '700',
  },
});

export default App;
