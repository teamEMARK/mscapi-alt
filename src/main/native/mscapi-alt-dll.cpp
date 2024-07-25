// mscapi-alt-dll.cpp : Defines the exported functions for the DLL.
//

#include "pch.h"
#include "framework.h"
#include "mscapi-alt-dll.h"

// This is an example of an exported variable
MSCAPIALTDLL_API int nmscapialtdll=0;

// This is an example of an exported function.
MSCAPIALTDLL_API int fnmscapialtdll(void)
{
    return 0;
}

// This is the constructor of a class that has been exported.
Cmscapialtdll::Cmscapialtdll()
{
    return;
}
