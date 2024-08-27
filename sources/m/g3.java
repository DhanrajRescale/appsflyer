package m;

import android.os.Parcel;
import android.os.Parcelable;
import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes.dex */
public final class g3 extends k4.b {
    public static final Parcelable.Creator<g3> CREATOR = new f3(0);

    /* renamed from: c, reason: collision with root package name */
    public boolean f25527c;

    public g3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f25527c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchView.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" isIconified=");
        return da.e.o(sb2, this.f25527c, UrlTreeKt.componentParamSuffix);
    }

    @Override // k4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f22040a, i10);
        parcel.writeValue(Boolean.valueOf(this.f25527c));
    }
}
