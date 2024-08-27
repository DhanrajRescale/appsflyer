package w8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vt.p0;

/* loaded from: classes.dex */
public final class c implements Parcelable {

    @Deprecated
    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new k6.d(23);

    /* renamed from: a, reason: collision with root package name */
    public final String f38854a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f38855b;

    public c(String str, Map map) {
        this.f38854a = str;
        this.f38855b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (Intrinsics.a(this.f38854a, cVar.f38854a) && Intrinsics.a(this.f38855b, cVar.f38855b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f38855b.hashCode() + (this.f38854a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f38854a + ", extras=" + this.f38855b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f38854a);
        Map map = this.f38855b;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public /* synthetic */ c(String str) {
        this(str, p0.d());
    }
}
