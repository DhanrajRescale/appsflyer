package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k1 implements Parcelable {
    public static final Parcelable.Creator<k1> CREATOR = new b(4);

    /* renamed from: a, reason: collision with root package name */
    public final String f1733a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1734b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1735c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1736d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1737e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1738f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1739g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1740h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1741i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1742j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1743k;

    /* renamed from: l, reason: collision with root package name */
    public final String f1744l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1745m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1746n;

    public k1(g0 g0Var) {
        this.f1733a = g0Var.getClass().getName();
        this.f1734b = g0Var.mWho;
        this.f1735c = g0Var.mFromLayout;
        this.f1736d = g0Var.mFragmentId;
        this.f1737e = g0Var.mContainerId;
        this.f1738f = g0Var.mTag;
        this.f1739g = g0Var.mRetainInstance;
        this.f1740h = g0Var.mRemoving;
        this.f1741i = g0Var.mDetached;
        this.f1742j = g0Var.mHidden;
        this.f1743k = g0Var.mMaxState.ordinal();
        this.f1744l = g0Var.mTargetWho;
        this.f1745m = g0Var.mTargetRequestCode;
        this.f1746n = g0Var.mUserVisibleHint;
    }

    public final g0 a(u0 u0Var) {
        g0 a10 = u0Var.a(this.f1733a);
        a10.mWho = this.f1734b;
        a10.mFromLayout = this.f1735c;
        a10.mRestored = true;
        a10.mFragmentId = this.f1736d;
        a10.mContainerId = this.f1737e;
        a10.mTag = this.f1738f;
        a10.mRetainInstance = this.f1739g;
        a10.mRemoving = this.f1740h;
        a10.mDetached = this.f1741i;
        a10.mHidden = this.f1742j;
        a10.mMaxState = androidx.lifecycle.n.values()[this.f1743k];
        a10.mTargetWho = this.f1744l;
        a10.mTargetRequestCode = this.f1745m;
        a10.mUserVisibleHint = this.f1746n;
        return a10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f1733a);
        sb2.append(" (");
        sb2.append(this.f1734b);
        sb2.append(")}:");
        if (this.f1735c) {
            sb2.append(" fromLayout");
        }
        int i10 = this.f1737e;
        if (i10 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i10));
        }
        String str = this.f1738f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f1739g) {
            sb2.append(" retainInstance");
        }
        if (this.f1740h) {
            sb2.append(" removing");
        }
        if (this.f1741i) {
            sb2.append(" detached");
        }
        if (this.f1742j) {
            sb2.append(" hidden");
        }
        String str2 = this.f1744l;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f1745m);
        }
        if (this.f1746n) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1733a);
        parcel.writeString(this.f1734b);
        parcel.writeInt(this.f1735c ? 1 : 0);
        parcel.writeInt(this.f1736d);
        parcel.writeInt(this.f1737e);
        parcel.writeString(this.f1738f);
        parcel.writeInt(this.f1739g ? 1 : 0);
        parcel.writeInt(this.f1740h ? 1 : 0);
        parcel.writeInt(this.f1741i ? 1 : 0);
        parcel.writeInt(this.f1742j ? 1 : 0);
        parcel.writeInt(this.f1743k);
        parcel.writeString(this.f1744l);
        parcel.writeInt(this.f1745m);
        parcel.writeInt(this.f1746n ? 1 : 0);
    }

    public k1(Parcel parcel) {
        this.f1733a = parcel.readString();
        this.f1734b = parcel.readString();
        this.f1735c = parcel.readInt() != 0;
        this.f1736d = parcel.readInt();
        this.f1737e = parcel.readInt();
        this.f1738f = parcel.readString();
        this.f1739g = parcel.readInt() != 0;
        this.f1740h = parcel.readInt() != 0;
        this.f1741i = parcel.readInt() != 0;
        this.f1742j = parcel.readInt() != 0;
        this.f1743k = parcel.readInt();
        this.f1744l = parcel.readString();
        this.f1745m = parcel.readInt();
        this.f1746n = parcel.readInt() != 0;
    }
}
