package dg;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new hb.e(16);

    /* renamed from: a, reason: collision with root package name */
    public String f14343a;

    /* renamed from: b, reason: collision with root package name */
    public String f14344b;

    /* renamed from: c, reason: collision with root package name */
    public String f14345c;

    /* renamed from: d, reason: collision with root package name */
    public String f14346d;

    /* renamed from: e, reason: collision with root package name */
    public String f14347e;

    /* renamed from: f, reason: collision with root package name */
    public String f14348f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(1);
    }
}
