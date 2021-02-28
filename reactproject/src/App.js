import {useEffect, useState} from 'react';
import axios from 'axios';

function App() {
	const [test, setTest] = useState();

	useEffect(async () => {
		const response = await axios.get('http://localhost:8088/test');
		console.log(response.data[0].MEM_ID);
		setTest(response.data[0].MEM_ID);
	}, []);

	return (
		<div>
			<h1>{test}</h1>
		</div>
	);
}

export default App;
