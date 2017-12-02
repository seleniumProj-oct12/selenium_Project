

Run("Notepad.exe")

WinWaitActive("Untitled - Notepad")

ControlSend("Untitled - Notepad","","Edit1","hello how r u vin....")

WinClose("Untitled - Notepad")

WinWaitActive("Notepad")

ControlClick("Notepad","","Button1")

WinWaitActive("Save As")

ControlFocus("Save As","","Edit1")

Send("E:\harish.txt")

ControlClick("Save As","","Button1")
