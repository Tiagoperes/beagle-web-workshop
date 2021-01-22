# About this repo
This repo holds the Beagle Web Workshop and the code for the project can be found within each
branch.

There are 5 branches in this repository: steps 1 to 5. Each step represents a breakpoint in the
presentation. The final step contains the final code.

The objective is to build the following interface using Beagle Angular and the Beagle Backend tool.

![Interface to build](https://i.ibb.co/Wnhpmhp/beagle-transfer.gif)

# Steps

## Step 0
This step is not reflected in a branch since it's entirely led by a Beagle Playground Project.
The project can be found [here](https://playground.usebagle.io/#/demo/web-workshop).

This project in the Beagle Playground builds a simpler version of the interface we need using only
default components and no installation of any tool is required.

**Objectives:**
- Create the page structure for the first form.
- Organize the elements in the page with the flex layout.
- Use styles to finish composing the page visuals.
- Create and manipulate a context.
- Submit the form and use the global context.
- Create the confirmation page and use the `sendRequest` action.
- Create the success page.

## Step 1
**Project state:**
- The bff is ready with 3 views: `/form`, `/confirm` and `/success`. All these views use only
default Beagle components.
- The Angular Project is a common website, without Beagle installed.

**Objectives:**
- Understand the BFF structure, analyzing how the JSONs in the playground project have been
converted to Kotlin code.
- Use Beagle Angular to load a server-driven flow from the backend.
- Develop the first custom component in the BFF (`title`).

## Step 2
**Project state:**
- The bff is ready with 4 views: `/form`, `/confirm`, `/success` and `/form-custom`.
- The custom component `title` is implemented in the BFF.
- Beagle is installed in the Angular project and the server-driven flow is already working.

**Objectives:**
- Implement the custom component `custom:title` in the front-end and load the view `/form-custom`
instead of `/form`.

## Step 3
**Project state:**
- The bff is ready with 6 views: `/form`, `/confirm`, `/success`, `/form-custom`, `/confirm-custom`
and `/success-custom`.
- All custom components are implemented in the BFF.
- All custom components are implemented in the front-end.

**Objectives:**
- Understand the implementation for the custom component `radioGroup` in both the BFF and the
front-end.
- Understand the implementation for the custom component `select` in both the BFF and the
front-end.
- Understand the implementation for the custom component `moneyInput` in both the BFF and the
front-end.
- In the BFF, use an operation to decide the label of someone's document (CPF if type is "F" and
CNPJ otherwise).
- In the BFF, change the page `/confirm-custom` to call the operation `currency()` for the monetary
value.

## Step 4
**Project state:**
- All views in the BFF are implemented.
- All custom components are implemented in the BFF.
- All custom components are implemented in the front-end.
- The document field change its label according to the value of radio group (`form.type`).
- The page `/confirm-custom` in the BFF uses the operation `currency`, but it doesn't exist in the
front-end.

**Objectives:**
- The operation `currency` doesn't exist, it's not a default operation. Implement this custom
operation in the front-end and see the result.

## Step 5 (EXTRA)
This is an extra step that shows how we could use external component libraries.

**Project state:**
- All views in the BFF are implemented.
- All custom components, including the `materialText` are implemented in the BFF.
- All custom components, including the `materialText` are implemented in the front-end.
- The document field change its label according to the value of radio group (`form.type`).
- Currency values are correctly formatted.

**Objectives:**
- Understand how we use the material component to replace the default text input.
