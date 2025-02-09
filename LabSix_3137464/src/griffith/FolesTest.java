package griffith;
import java.io.*;
import java.util.ArrayList;
import java.net.URL;
import java.util.Scanner;


public class FolesTest {

	public static void main(String[] args) {
		
		
	        String filename = "myFile.txt"; // Provide the filename
	        sortFile(filename);
		
		
		
		
		class FileSorting {
		    
		 

		    // Method to read content from a file and store it in an ArrayList
		    private static ArrayList<String> readFileContent(String filename) {
		        ArrayList<String> content = new ArrayList<>();
		        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
		            String line;
		            while ((line = br.readLine()) != null) {
		                content.add(line);
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		        return content;
		    }

		

		    // Method to sort content from a file
		   public static void sortFile(String filename) {
		        ArrayList<String> content = readFileContent(filename);
		        if (content.isEmpty()) {
		            System.out.println("File is empty or does not exist.");
		            return;
		        }
		        bubbleSortArrayList(content);
		        writeToFile(content, filename);
		    }

		   
		}


	}

	public static void sortFile(String filename) {
	
	ArrayList<String> content = readFileContent(filename);
    if (content.isEmpty()) {
        System.out.println("File is empty or does not exist.");
        return;
    }
    bubbleSortArrayList(content);
    writeToFile(content, filename);
}

	public static void bubbleSortArrayList(ArrayList<String> content) {
		ArrayList<String> values = null;
		int n = values.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (values.get(j).compareTo(values.get(j + 1)) > 0) {
                    // Swap values[j] and values[j+1]
                    String temp = values.get(j);
                    values.set(j, values.get(j + 1));
                    values.set(j + 1, temp);
                }
            }
        }
		
	}

	public static void writeToFile(ArrayList<String> content, String filename) {
		String sortedFilename = filename.substring(0, filename.lastIndexOf('.')) + "_sorted.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(sortedFilename))) {
            String[] sortedContent = null;
			for (String line : sortedContent) {
                writer.println(line);
            }
            System.out.println("Sorted content has been saved to: " + sortedFilename);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

	public static ArrayList<String> readFileContent(String filename) {
		ArrayList<String> content = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
	}
	class FileDownloader {
	    // Method to download file from URL and save it to specified location with given filename
	    public static void download(String url, String fileName, String location) {
	        try {
	            // Check if URL and fileName have valid extensions and match
	            if (!url.contains(".") || !fileName.contains(".")) {
	                System.out.println("URL and fileName must have valid extensions.");
	                return;
	            }
	            String urlExtension = url.substring(url.lastIndexOf('.'));
	            String fileExtension = fileName.substring(fileName.lastIndexOf('.'));
	            if (!urlExtension.equals(fileExtension)) {
	                System.out.println("Extensions in URL and fileName must match.");
	                return;
	            }

	            // Open a connection to the URL
	            URL fileUrl = new URL(url);
	            InputStream inputStream = fileUrl.openStream();

	            // Create output directory if it doesn't exist
	            File outputDirectory = new File(location);
	            if (!outputDirectory.exists()) {
	                outputDirectory.mkdirs();
	            }

	            // Open output stream to save the file
	            OutputStream outputStream = new FileOutputStream(location + File.separator + fileName);

	            // Download the file
	            byte[] buffer = new byte[1024];
	            int bytesRead;
	            while ((bytesRead = inputStream.read(buffer)) != -1) {
	                outputStream.write(buffer, 0, bytesRead);
	            }

	            // Close streams
	            inputStream.close();
	            outputStream.close();

	            System.out.println("File downloaded successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	            System.out.println("Error downloading file: " + e.getMessage());
	        }
	    }

	    // Main method to test the download function
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask user for URL, fileName, and location
	        System.out.print("Enter the URL you want to download: ");
	        String url = scanner.nextLine().trim();
	        System.out.print("Enter the fileName you want to save it as (including extension): ");
	        String fileName = scanner.nextLine().trim();
	        System.out.print("Enter the location you want to save it to: ");
	        String location = scanner.nextLine().trim();

	        // Ensure URL and fileName have valid extensions and match
	        while (!url.contains(".") || !fileName.contains(".") || !url.substring(url.lastIndexOf('.')).equals(fileName.substring(fileName.lastIndexOf('.')))) {
	            System.out.println("URL and fileName must have valid extensions and match.");
	            System.out.print("Enter the URL you want to download: ");
	            url = scanner.nextLine().trim();
	            System.out.print("Enter the fileName you want to save it as (including extension): ");
	            fileName = scanner.nextLine().trim();
	        }

	        // Call download method
	        download(url, fileName, location);
	        scanner.close();
	    }
	}
	}

	

