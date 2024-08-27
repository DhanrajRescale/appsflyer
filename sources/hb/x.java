package hb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class x implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<x> CREATOR = new e(12);

    /* renamed from: a, reason: collision with root package name */
    public final String f18237a;

    /* renamed from: b, reason: collision with root package name */
    public final List f18238b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18239c;

    /* renamed from: d, reason: collision with root package name */
    public final List f18240d;

    public x(String str, ArrayList elements, boolean z10, List list) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f18237a = str;
        this.f18238b = elements;
        this.f18239c = z10;
        this.f18240d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.a(this.f18237a, xVar.f18237a) && Intrinsics.a(this.f18238b, xVar.f18238b) && this.f18239c == xVar.f18239c && Intrinsics.a(this.f18240d, xVar.f18240d);
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        String str = this.f18237a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int d10 = v.e.d(this.f18239c, nn.d.e(this.f18238b, hashCode * 31, 31), 31);
        List list = this.f18240d;
        if (list != null) {
            i10 = list.hashCode();
        }
        return d10 + i10;
    }

    public final String toString() {
        return "FeedStream(title=" + this.f18237a + ", elements=" + this.f18238b + ", isEndOfResponse=" + this.f18239c + ", filters=" + this.f18240d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f18237a);
        Iterator p10 = a3.a.p(this.f18238b, out);
        while (p10.hasNext()) {
            ((u) p10.next()).writeToParcel(out, i10);
        }
        out.writeInt(this.f18239c ? 1 : 0);
        List list = this.f18240d;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator o10 = a3.a.o(out, 1, list);
        while (o10.hasNext()) {
            ((v) o10.next()).writeToParcel(out, i10);
        }
    }
}
