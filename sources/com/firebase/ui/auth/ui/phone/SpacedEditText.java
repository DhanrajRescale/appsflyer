package com.firebase.ui.auth.ui.phone;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ScaleXSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import okhttp3.HttpUrl;
import zl.f;

/* loaded from: classes.dex */
public final class SpacedEditText extends TextInputEditText {

    /* renamed from: i, reason: collision with root package name */
    public final float f10955i;

    /* renamed from: j, reason: collision with root package name */
    public SpannableStringBuilder f10956j;

    public SpacedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10956j = new SpannableStringBuilder(HttpUrl.FRAGMENT_ENCODE_SET);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f42571a);
        this.f10955i = obtainStyledAttributes.getFloat(0, 1.0f);
        obtainStyledAttributes.recycle();
    }

    public Editable getUnspacedText() {
        return this.f10956j;
    }

    @Override // android.widget.EditText
    public void setSelection(int i10) {
        int min = Math.min(Math.max((i10 * 2) - 1, 0), (this.f10956j.length() * 2) - 1);
        try {
            super.setSelection(min);
        } catch (IndexOutOfBoundsException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage() + ", requestedIndex=" + i10 + ", newIndex= " + min + ", originalText=" + ((Object) this.f10956j));
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        int i10;
        this.f10956j = new SpannableStringBuilder(charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = charSequence.length();
        int i11 = -1;
        int i12 = 0;
        while (true) {
            i10 = length - 1;
            if (i12 >= i10) {
                break;
            }
            spannableStringBuilder.append(charSequence.charAt(i12));
            spannableStringBuilder.append((CharSequence) " ");
            int i13 = i11 + 2;
            spannableStringBuilder.setSpan(new ScaleXSpan(this.f10955i), i13, i11 + 3, 33);
            i12++;
            i11 = i13;
        }
        if (length != 0) {
            spannableStringBuilder.append(charSequence.charAt(i10));
        }
        super.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
    }
}
