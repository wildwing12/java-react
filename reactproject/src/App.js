import React from 'react';
import {Route} from 'react-router-dom';
import LoginPage from './Component/LoginPage';

function App() {
	return (
		<div>
			<Route path='/' exact component={LoginPage} />
		</div>
	);
}

export default App;
