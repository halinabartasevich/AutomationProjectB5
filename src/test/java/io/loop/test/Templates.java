package io.loop.test;

public class Templates {
    public static void main(String[] args) {

        /*              different chrome options

		options.addArguments("--start-maximized"); // Start maximized
        options.addArguments("--headless"); // Run in headless mode
        options.addArguments("--disable-extensions"); // Disable extensions
        options.addArguments("--incognito"); // Start in incognito mode
        options.addArguments("--disable-notifications"); // Disable notifications
        options.addArguments("window-size=1200x600"); // Custom window size
        options.addArguments("user-agent=Custom User Agent"); // Custom user-agent
        options.addArguments("disable-infobars"); // Disable infobars
        options.addArguments("--proxy-server=http://my-proxy:1234"); // Proxy settings
        options.addArguments("--start-fullscreen"); // Start in fullscreen
        options.addArguments("user-data-dir=/path/to/your/custom/profile"); // Custom profile
        options.addArguments("--disable-gpu"); // Disable GPU hardware acceleration
        options.setAcceptInsecureCerts(true); // Accept insecure SSL certificates
        options.addExtensions(new File("/path/to/extension.crx")); // Add extensions
        options.addArguments("--lang=es"); // Set language to Spanish
        options.addArguments("--remote-debugging-port=9222"); // Enable remote debugging


navigators
==================
=> driver.get()
=> navigate.to
=> navigate.back
=> navigate.forward
=> navigate.refresh
=> driver.close
=> driver.quit
=> driver.getTitle
=> driver.getCurrentUrl
=> element.click
=> element.clear
=> sendKeys
=> Keys.Enter

sendKeys - sends to web
clear    - clears the text
Keys     - simulates the keyboard actions

Key Constant	    Description
Keys.ENTER	        Simulates pressing the Enter key.
Keys.RETURN	        Alternative for the Enter key.
Keys.TAB	        Simulates pressing the Tab key.
Keys.ESCAPE	        Simulates pressing the Escape key.
Keys.SPACE	        Simulates pressing the Spacebar key.
Keys.BACK_SPACE	    Simulates pressing Backspace.
Keys.DELETE	        Simulates pressing Delete.
Keys.SHIFT	        Simulates pressing the Shift key.
Keys.CONTROL (or Keys.CONTROL)	Simulates pressing the Ctrl key.
Keys.ALT	        Simulates pressing the Alt key.
Keys.F1 to Keys.F12	Function keys F1 through F12.
Keys.ARROW_UP	    Simulates pressing the Up Arrow key.
Keys.ARROW_DOWN	    Simulates pressing the Down Arrow key.
Keys.ARROW_LEFT	    Simulates pressing the Left Arrow key.
Keys.ARROW_RIGHT	Simulates pressing the Right Arrow key.
Keys.HOME	        Simulates pressing the Home key.
Keys.END	        Simulates pressing the End key.
Keys.PAGE_UP	    Simulates pressing the Page Up key.
Keys.PAGE_DOWN	    Simulates pressing the Page Down key.
Keys.INSERT	        Simulates pressing the Insert key.
Keys.SHIFT	        Presses the Shift key.
Keys.CONTROL (or Keys.CTRL)	Presses the Control (Ctrl) key.
Keys.ALT	                Presses the Alt key.
Keys.COMMAND (Mac only)	    Presses the Command (⌘) key on macOS.


locators

==================

with the help of findElement and By
=> id
=> name
=> linktext
=> partialLinktext
=> className
=> tag
=> css
=> xpath













        // create an option to avoid GOOGLE CAPTURE
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-blink-features=AutomationControlled");


*/
    }
}
