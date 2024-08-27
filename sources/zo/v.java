package zo;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class v extends d4.c {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f42698d;

    public v(TextInputLayout textInputLayout) {
        this.f42698d = textInputLayout;
    }

    @Override // d4.c
    public final void d(View view, e4.m mVar) {
        CharSequence charSequence;
        String str;
        View.AccessibilityDelegate accessibilityDelegate = this.f13725a;
        AccessibilityNodeInfo accessibilityNodeInfo = mVar.f14996a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f42698d;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            charSequence = editText.getText();
        } else {
            charSequence = null;
        }
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z10 = !isEmpty;
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(hint);
        boolean z13 = !textInputLayout.I0;
        boolean z14 = !TextUtils.isEmpty(error);
        if (!z14 && TextUtils.isEmpty(counterOverflowDescription)) {
            z11 = false;
        }
        if (z12) {
            str = hint.toString();
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        t tVar = textInputLayout.f11480b;
        AppCompatTextView appCompatTextView = tVar.f42687b;
        if (appCompatTextView.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView);
            accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
        } else {
            accessibilityNodeInfo.setTraversalAfter(tVar.f42689d);
        }
        if (z10) {
            mVar.s(charSequence);
        } else if (!TextUtils.isEmpty(str)) {
            mVar.s(str);
            if (z13 && placeholderText != null) {
                mVar.s(str + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            mVar.s(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                mVar.o(str);
            } else {
                if (z10) {
                    str = ((Object) charSequence) + ", " + str;
                }
                mVar.s(str);
            }
            if (i10 >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                mVar.i(4, isEmpty);
            }
        }
        if (charSequence == null || charSequence.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z11) {
            if (!z14) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        AppCompatTextView appCompatTextView2 = textInputLayout.f11493j.f42671y;
        if (appCompatTextView2 != null) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView2);
        }
        textInputLayout.f11481c.b().n(mVar);
    }

    @Override // d4.c
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f42698d.f11481c.b().o(accessibilityEvent);
    }
}
