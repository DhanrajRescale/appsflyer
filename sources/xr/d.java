package xr;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class d extends SpannableStringBuilder implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new zq.c(6);

    public final List a() {
        a[] aVarArr = (a[]) getSpans(0, length(), a.class);
        if (aVarArr != null) {
            return Arrays.asList(aVarArr);
        }
        return new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        a[] aVarArr;
        if ((obj instanceof CharacterStyle) && (aVarArr = (a[]) getSpans(i10, i11, a.class)) != null && aVarArr.length > 0) {
            return;
        }
        if ((obj == Selection.SELECTION_START || obj == Selection.SELECTION_END) && length() == 0) {
            i10 = 0;
            i11 = 0;
        }
        if (i10 >= 0 && i11 >= i10 && i11 <= length()) {
            super.setSpan(obj, i10, i11, i12);
            return;
        }
        Log.w(d.class.getName(), "Attempted to set span at invalid indices, start=" + i10 + ", end=" + i11);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(toString());
        int size = a().size();
        parcel.writeInt(size);
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = (a) a().get(i11);
                parcel.writeInt(getSpanStart(aVar));
                parcel.writeInt(getSpanEnd(aVar));
                aVar.writeToParcel(parcel, i10);
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        int i14;
        if (i10 == i11 && (i14 = (i10 - i13) - 1) >= 0 && charSequence.length() > 1) {
            String charSequence2 = charSequence.subSequence(i12, i13).toString();
            int i15 = i10 - 1;
            String charSequence3 = subSequence(i14, i15).toString();
            a[] aVarArr = (a[]) getSpans(i14, i15, a.class);
            if (charSequence2.equals(charSequence3) && aVarArr.length > 0) {
                return super.replace(i15, i10, HttpUrl.FRAGMENT_ENCODE_SET, 0, 0);
            }
        }
        return super.replace(i10, i11, charSequence, i12, i13);
    }
}
