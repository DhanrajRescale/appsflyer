package zo;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import m.f3;

/* loaded from: classes2.dex */
public final class x extends k4.b {
    public static final Parcelable.Creator<x> CREATOR = new f3(17);

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f42699c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f42700d;

    public x(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f42699c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f42700d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f42699c) + UrlTreeKt.componentParamSuffix;
    }

    @Override // k4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f22040a, i10);
        TextUtils.writeToParcel(this.f42699c, parcel, i10);
        parcel.writeInt(this.f42700d ? 1 : 0);
    }
}
