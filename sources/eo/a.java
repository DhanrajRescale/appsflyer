package eo;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.NonNull;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import nn.d;
import zi.j;

/* loaded from: classes2.dex */
public final class a extends View.BaseSavedState {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new j(29);

    /* renamed from: a, reason: collision with root package name */
    public int f15760a;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" CheckedState=");
        int i10 = this.f15760a;
        if (i10 != 1) {
            if (i10 != 2) {
                str = "unchecked";
            } else {
                str = "indeterminate";
            }
        } else {
            str = "checked";
        }
        return d.o(sb2, str, UrlTreeKt.componentParamSuffix);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeValue(Integer.valueOf(this.f15760a));
    }
}
