package hb;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new k6.d(28);

    /* renamed from: a, reason: collision with root package name */
    public final float f18146a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18147b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18148c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18149d;

    public c(float f10, float f11, float f12, boolean z10) {
        this.f18146a = f10;
        this.f18147b = f11;
        this.f18148c = f12;
        this.f18149d = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f18146a, cVar.f18146a) == 0 && Float.compare(this.f18147b, cVar.f18147b) == 0 && Float.compare(this.f18148c, cVar.f18148c) == 0 && this.f18149d == cVar.f18149d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18149d) + v.e.a(this.f18148c, v.e.a(this.f18147b, Float.hashCode(this.f18146a) * 31, 31), 31);
    }

    public final String toString() {
        return "ProgressBar(entryPosition=" + this.f18146a + ", indicatorPosition=" + this.f18147b + ", endPosition=" + this.f18148c + ", isNegativeTrade=" + this.f18149d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeFloat(this.f18146a);
        out.writeFloat(this.f18147b);
        out.writeFloat(this.f18148c);
        out.writeInt(this.f18149d ? 1 : 0);
    }
}
