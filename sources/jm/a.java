package jm;

import am.d;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.firebase.ui.auth.ui.phone.PhoneNumberVerificationHandler;
import com.firebase.ui.auth.ui.phone.SpacedEditText;
import gm.f;
import java.util.Collections;
import ll.o;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class a implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f21466a;

    /* renamed from: b, reason: collision with root package name */
    public final o f21467b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f21468c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21469d;

    public a(SpacedEditText spacedEditText, o oVar) {
        this.f21466a = spacedEditText;
        String[] strArr = new String[7];
        for (int i10 = 0; i10 <= 6; i10++) {
            strArr[i10] = TextUtils.join(HttpUrl.FRAGMENT_ENCODE_SET, Collections.nCopies(i10, "-"));
        }
        this.f21468c = strArr;
        this.f21467b = oVar;
        this.f21469d = "-";
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        o oVar;
        String replaceAll = charSequence.toString().replaceAll(" ", HttpUrl.FRAGMENT_ENCODE_SET).replaceAll(this.f21469d, HttpUrl.FRAGMENT_ENCODE_SET);
        int min = Math.min(replaceAll.length(), 6);
        String substring = replaceAll.substring(0, min);
        EditText editText = this.f21466a;
        editText.removeTextChangedListener(this);
        editText.setText(substring + this.f21468c[6 - min]);
        editText.setSelection(min);
        editText.addTextChangedListener(this);
        if (min == 6 && (oVar = this.f21467b) != null) {
            f fVar = (f) oVar.f24937b;
            PhoneNumberVerificationHandler phoneNumberVerificationHandler = fVar.f17513d;
            phoneNumberVerificationHandler.h(d.c(new gm.d(fVar.f17514e, new zp.o(phoneNumberVerificationHandler.f10953h, fVar.f17519j.getUnspacedText().toString(), null, null, true), false)));
        }
    }
}
