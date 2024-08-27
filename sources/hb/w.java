package hb;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class w implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<w> CREATOR = new e(15);

    /* renamed from: a, reason: collision with root package name */
    public final String f18234a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18235b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18236c;

    public w(String name, String str, String symbol) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f18234a = name;
        this.f18235b = str;
        this.f18236c = symbol;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.a(this.f18234a, wVar.f18234a) && Intrinsics.a(this.f18235b, wVar.f18235b) && Intrinsics.a(this.f18236c, wVar.f18236c);
    }

    public final int hashCode() {
        int hashCode = this.f18234a.hashCode() * 31;
        String str = this.f18235b;
        return this.f18236c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SymbolsMeta(name=");
        sb2.append(this.f18234a);
        sb2.append(", imageUrl=");
        sb2.append(this.f18235b);
        sb2.append(", symbol=");
        return nn.d.o(sb2, this.f18236c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f18234a);
        out.writeString(this.f18235b);
        out.writeString(this.f18236c);
    }
}
