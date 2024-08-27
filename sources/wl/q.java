package wl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import nl.n0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class q implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<q> CREATOR = new zi.j(16);

    /* renamed from: a, reason: collision with root package name */
    public final p f39245a;

    /* renamed from: b, reason: collision with root package name */
    public Set f39246b;

    /* renamed from: c, reason: collision with root package name */
    public final d f39247c;

    /* renamed from: d, reason: collision with root package name */
    public final String f39248d;

    /* renamed from: e, reason: collision with root package name */
    public final String f39249e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f39250f;

    /* renamed from: g, reason: collision with root package name */
    public final String f39251g;

    /* renamed from: h, reason: collision with root package name */
    public final String f39252h;

    /* renamed from: i, reason: collision with root package name */
    public final String f39253i;

    /* renamed from: j, reason: collision with root package name */
    public String f39254j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f39255k;

    /* renamed from: l, reason: collision with root package name */
    public final e0 f39256l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f39257m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f39258n;

    /* renamed from: o, reason: collision with root package name */
    public final String f39259o;

    /* renamed from: p, reason: collision with root package name */
    public final String f39260p;

    /* renamed from: q, reason: collision with root package name */
    public final String f39261q;

    /* renamed from: r, reason: collision with root package name */
    public final a f39262r;

    public q(p loginBehavior, Set set, d defaultAudience, String authType, String applicationId, String authId, e0 e0Var, String str, String str2, String str3, a aVar) {
        Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
        Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
        Intrinsics.checkNotNullParameter(authType, "authType");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(authId, "authId");
        this.f39245a = loginBehavior;
        this.f39246b = set == null ? new HashSet() : set;
        this.f39247c = defaultAudience;
        this.f39252h = authType;
        this.f39248d = applicationId;
        this.f39249e = authId;
        this.f39256l = e0Var == null ? e0.FACEBOOK : e0Var;
        if (str == null || str.length() == 0) {
            this.f39259o = a3.a.d("randomUUID().toString()");
        } else {
            this.f39259o = str;
        }
        this.f39260p = str2;
        this.f39261q = str3;
        this.f39262r = aVar;
    }

    public final boolean a() {
        return this.f39256l == e0.INSTAGRAM;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        String name;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f39245a.name());
        dest.writeStringList(new ArrayList(this.f39246b));
        dest.writeString(this.f39247c.name());
        dest.writeString(this.f39248d);
        dest.writeString(this.f39249e);
        dest.writeByte(this.f39250f ? (byte) 1 : (byte) 0);
        dest.writeString(this.f39251g);
        dest.writeString(this.f39252h);
        dest.writeString(this.f39253i);
        dest.writeString(this.f39254j);
        dest.writeByte(this.f39255k ? (byte) 1 : (byte) 0);
        dest.writeString(this.f39256l.name());
        dest.writeByte(this.f39257m ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f39258n ? (byte) 1 : (byte) 0);
        dest.writeString(this.f39259o);
        dest.writeString(this.f39260p);
        dest.writeString(this.f39261q);
        a aVar = this.f39262r;
        if (aVar == null) {
            name = null;
        } else {
            name = aVar.name();
        }
        dest.writeString(name);
    }

    public q(Parcel parcel) {
        String readString = parcel.readString();
        n0.L(readString, "loginBehavior");
        this.f39245a = p.valueOf(readString);
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f39246b = new HashSet(arrayList);
        String readString2 = parcel.readString();
        this.f39247c = readString2 != null ? d.valueOf(readString2) : d.NONE;
        String readString3 = parcel.readString();
        n0.L(readString3, "applicationId");
        this.f39248d = readString3;
        String readString4 = parcel.readString();
        n0.L(readString4, "authId");
        this.f39249e = readString4;
        this.f39250f = parcel.readByte() != 0;
        this.f39251g = parcel.readString();
        String readString5 = parcel.readString();
        n0.L(readString5, "authType");
        this.f39252h = readString5;
        this.f39253i = parcel.readString();
        this.f39254j = parcel.readString();
        this.f39255k = parcel.readByte() != 0;
        String readString6 = parcel.readString();
        this.f39256l = readString6 != null ? e0.valueOf(readString6) : e0.FACEBOOK;
        this.f39257m = parcel.readByte() != 0;
        this.f39258n = parcel.readByte() != 0;
        String readString7 = parcel.readString();
        n0.L(readString7, "nonce");
        this.f39259o = readString7;
        this.f39260p = parcel.readString();
        this.f39261q = parcel.readString();
        String readString8 = parcel.readString();
        this.f39262r = readString8 == null ? null : a.valueOf(readString8);
    }
}
