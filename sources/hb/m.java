package hb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class m implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<m> CREATOR = new e(4);

    /* renamed from: a, reason: collision with root package name */
    public final List f18204a;

    public m(List list) {
        this.f18204a = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.a(this.f18204a, ((m) obj).f18204a);
    }

    public final int hashCode() {
        List list = this.f18204a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a3.a.l(new StringBuilder("Attachments(media="), this.f18204a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        List list = this.f18204a;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator o10 = a3.a.o(out, 1, list);
        while (o10.hasNext()) {
            ((k) o10.next()).writeToParcel(out, i10);
        }
    }
}
