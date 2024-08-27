package g4;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f16530a = new String[0];

    public static void a(EditorInfo editorInfo, CharSequence charSequence) {
        int i10;
        int i11;
        CharSequence subSequence;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 30) {
            b.a(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i12 >= 30) {
            b.a(editorInfo, charSequence);
            return;
        }
        int i13 = editorInfo.initialSelStart;
        int i14 = editorInfo.initialSelEnd;
        if (i13 > i14) {
            i10 = i14;
        } else {
            i10 = i13;
        }
        if (i13 <= i14) {
            i13 = i14;
        }
        int length = charSequence.length();
        if (i10 >= 0 && i13 <= length) {
            int i15 = editorInfo.inputType & 4095;
            if (i15 != 129 && i15 != 225 && i15 != 18) {
                if (length <= 2048) {
                    b(editorInfo, charSequence, i10, i13);
                    return;
                }
                int i16 = i13 - i10;
                if (i16 > 1024) {
                    i11 = 0;
                } else {
                    i11 = i16;
                }
                int i17 = 2048 - i11;
                int min = Math.min(charSequence.length() - i13, i17 - Math.min(i10, (int) (i17 * 0.8d)));
                int min2 = Math.min(i10, i17 - min);
                int i18 = i10 - min2;
                if (Character.isLowSurrogate(charSequence.charAt(i18))) {
                    i18++;
                    min2--;
                }
                if (Character.isHighSurrogate(charSequence.charAt((i13 + min) - 1))) {
                    min--;
                }
                int i19 = min2 + i11;
                int i20 = i19 + min;
                if (i11 != i16) {
                    subSequence = TextUtils.concat(charSequence.subSequence(i18, i18 + min2), charSequence.subSequence(i13, min + i13));
                } else {
                    subSequence = charSequence.subSequence(i18, i20 + i18);
                }
                b(editorInfo, subSequence, min2, i19);
                return;
            }
            b(editorInfo, null, 0, 0);
            return;
        }
        b(editorInfo, null, 0, 0);
    }

    public static void b(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i10);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i11);
    }
}
