use rand::Rng;

/*Sort function 
	 Best-Case Time Complexity of O(nlogn)
	 Worst-Case Time Complexity of O(n^2)
*/ 
        fn sort_ascending(mut input_vector:Vec<i32>) -> Vec<i32>
        {

                if input_vector.len() <= 1 { return input_vector;}

             
                let pivot = input_vector.remove(0);
                let lesser: Vec<i32> = input_vector
                                        .iter()   //returns element reference memory address
                                        .cloned() // cloning the value
                                        .filter(|x| *x <= pivot)
                                        .collect();//return result
                let greater: Vec<i32> = input_vector
                                        .iter() //return element reference memory address
                                        .cloned()
                                        .filter(|x| *x >= pivot)
                                        .collect();//return result

                let mut sorted_vector = sort_ascending(lesser);
                sorted_vector.push(pivot);
                sorted_vector.extend(sort_ascending(greater));
                sorted_vector
        }

fn main() {
	//Playing with Array using RUST as the language - Carl Marwin Apitong
	const ARRAYSIZE: usize = 7;
	const MINVALUE: i32 = 0;
	const MAXVALUE: i32 = 50;
	let mut range = rand::thread_rng();
	let mut number_arrays:[i32;ARRAYSIZE] = [0;ARRAYSIZE];
	let mut counter:usize = 0;

	//Generate random numbers for each element as value of array. 
	loop{
		number_arrays[counter] = range.gen_range(MINVALUE..MAXVALUE);
		if counter == (number_arrays.len() - 1) { break;}
		counter += 1; 
	}
	
	println!("******************************************************************");
	println!("\nAssignment in Data Structure - Array using RUST \n Created by: Carl Marwin Apitong \n Date: 09/20/2025");
	println!("Array activity: \n 1.Create an 1-D array containing 7 elements \n 2. Sort it in ascending order \n 3. Print index 2 \n");
	println!("******************************************************************");
	//Printing Entire Array for validation.
	
	//For Task1: Create a 1-D array containing 7 elements.
	println!("Task1: Create 1-D array with the size of 7. \n Numbers: {:?}",number_arrays);

	 //Convert Array to Vector
        let input_vector = number_arrays[0..ARRAYSIZE].to_vec();

	//For Task2: Sort it into ascending order.
	let sorted_array = sort_ascending(input_vector);
	println!("Task2: Sort elements of array in ascending order. \n Sorted Numbers: {:?}", sorted_array);
  	
	//For Task3: Output index[2] in the display.
	println!("Task3: Display index[2] of sorted array:\n {}", sorted_array[2]);
	}
