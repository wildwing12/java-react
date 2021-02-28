import React from 'react';
import {Route} from 'react-router-dom';
import LoginPage from './container/LoginPage';
import Dashboard from './component/NavigationBar';

function App() {
	return (
		<div>
			<Route path='/' exact component={LoginPage} />
			<Route path='/test' exact component={Dashboard} />
		</div>
	);
}

export default App;
