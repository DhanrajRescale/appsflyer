package wl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import nl.n0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<s> CREATOR = new zi.j(17);

    /* renamed from: a, reason: collision with root package name */
    public final r f39268a;

    /* renamed from: b, reason: collision with root package name */
    public final xk.a f39269b;

    /* renamed from: c, reason: collision with root package name */
    public final xk.i f39270c;

    /* renamed from: d, reason: collision with root package name */
    public final String f39271d;

    /* renamed from: e, reason: collision with root package name */
    public final String f39272e;

    /* renamed from: f, reason: collision with root package name */
    public final q f39273f;

    /* renamed from: g, reason: collision with root package name */
    public Map f39274g;

    /* renamed from: h, reason: collision with root package name */
    public HashMap f39275h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(q qVar, r code, xk.a aVar, String str, String str2) {
        this(qVar, code, aVar, null, str, str2);
        Intrinsics.checkNotNullParameter(code, "code");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f39268a.name());
        dest.writeParcelable(this.f39269b, i10);
        dest.writeParcelable(this.f39270c, i10);
        dest.writeString(this.f39271d);
        dest.writeString(this.f39272e);
        dest.writeParcelable(this.f39273f, i10);
        n0.V(dest, this.f39274g);
        n0.V(dest, this.f39275h);
    }

    public s(q qVar, r code, xk.a aVar, xk.i iVar, String str, String str2) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f39273f = qVar;
        this.f39269b = aVar;
        this.f39270c = iVar;
        this.f39271d = str;
        this.f39268a = code;
        this.f39272e = str2;
    }

    public s(Parcel parcel) {
        String readString = parcel.readString();
        this.f39268a = r.valueOf(readString == null ? "error" : readString);
        this.f39269b = (xk.a) parcel.readParcelable(xk.a.class.getClassLoader());
        this.f39270c = (xk.i) parcel.readParcelable(xk.i.class.getClassLoader());
        this.f39271d = parcel.readString();
        this.f39272e = parcel.readString();
        this.f39273f = (q) parcel.readParcelable(q.class.getClassLoader());
        this.f39274g = n0.O(parcel);
        this.f39275h = n0.O(parcel);
    }
}
