// The following ifdef block is the standard way of creating macros which make exporting
// from a DLL simpler. All files within this DLL are compiled with the MSCAPIALTDLL_EXPORTS
// symbol defined on the command line. This symbol should not be defined on any project
// that uses this DLL. This way any other project whose source files include this file see
// MSCAPIALTDLL_API functions as being imported from a DLL, whereas this DLL sees symbols
// defined with this macro as being exported.
#ifdef MSCAPIALTDLL_EXPORTS
#define MSCAPIALTDLL_API __declspec(dllexport)
#else
#define MSCAPIALTDLL_API __declspec(dllimport)
#endif

// This class is exported from the dll
class MSCAPIALTDLL_API Cmscapialtdll {
public:
	Cmscapialtdll(void);
	// TODO: add your methods here.
};

extern MSCAPIALTDLL_API int nmscapialtdll;

MSCAPIALTDLL_API int fnmscapialtdll(void);
