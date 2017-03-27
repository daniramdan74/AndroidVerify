package com.pchmn.formvalidator.validators;


import android.util.Patterns;

import com.pchmn.formvalidator.App;
import com.pchmn.formvalidator.R;

public class UrlValidator extends AbstractValidator {

    public UrlValidator() {
        mErrorMessage = App.getContext().getString(R.string.error_invalid_url);
    }

    @Override
    public boolean isValid(String value) {
        return Patterns.WEB_URL.matcher(value).matches();
    }

    @Override
    public String getErrorMessage() {
        return mErrorMessage;
    }
}
