import {Alert} from 'react-native';

const HeadlessTask = async taskData => {
  // Handle your background task logic here
  console.log('Headless task started:', taskData);

  // Example: Show an alert in background
  Alert.alert('Background Task', 'Running in the background!');

  // IMPORTANT: Return a promise to indicate task completion
  return Promise.resolve();
};

export default HeadlessTask;
