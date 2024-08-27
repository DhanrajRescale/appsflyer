package hb;

import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.data.remote.request.WithdrawInitiateDto;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18165a;

    public /* synthetic */ e(int i10) {
        this.f18165a = i10;
    }

    /* JADX WARN: Type inference failed for: r3v53, types: [java.lang.Object, yh.a] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        b bVar = null;
        ArrayList arrayList = null;
        Boolean valueOf = null;
        fg.c cVar = null;
        ArrayList arrayList2 = null;
        m mVar = null;
        l lVar = null;
        ArrayList arrayList3 = null;
        int i10 = 0;
        int i11 = 0;
        boolean z14 = false;
        int i12 = 0;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        int i13 = 0;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = true;
        switch (this.f18165a) {
            case 0:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new f(parcel.readDouble(), parcel.readLong());
            case 1:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                a0 valueOf2 = a0.valueOf(parcel.readString());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    bVar = b.CREATOR.createFromParcel(parcel);
                }
                return new g(valueOf2, readString, readString2, bVar);
            case 2:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new h(c0.valueOf(parcel.readString()), parcel.readInt(), parcel.readDouble(), parcel.readDouble(), d0.valueOf(parcel.readString()), b0.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            case 3:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new s(parcel.readString(), parcel.readString(), parcel.readString(), r.CREATOR.createFromParcel(parcel), j.CREATOR.createFromParcel(parcel), q.CREATOR.createFromParcel(parcel));
            case 4:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    arrayList3 = new ArrayList(readInt);
                    while (i10 != readInt) {
                        i10 = jr.h.e(k.CREATOR, parcel, arrayList3, i10, 1);
                    }
                }
                return new m(arrayList3);
            case 5:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    lVar = l.CREATOR.createFromParcel(parcel);
                }
                return new k(readString3, readString4, readString5, readString6, readString7, lVar);
            case 6:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new l(parcel.readString());
            case 7:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() != 0) {
                    z20 = true;
                }
                return new n(z20);
            case 8:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() != 0) {
                    z19 = true;
                }
                return new o(parcel.readInt(), z19);
            case 9:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                p createFromParcel = p.CREATOR.createFromParcel(parcel);
                o createFromParcel2 = o.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    mVar = m.CREATOR.createFromParcel(parcel);
                }
                return new q(createFromParcel, createFromParcel2, mVar, n.CREATOR.createFromParcel(parcel));
            case 10:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() != 0) {
                    z18 = true;
                }
                return new p(parcel.readInt(), z18);
            case 11:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString8 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                return new r(readString8, z10, z11, readString9, readString10, readString11, z12, readString12, readString13, z13);
            case 12:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString14 = parcel.readString();
                int readInt2 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt2);
                int i14 = 0;
                while (i14 != readInt2) {
                    i14 = jr.h.e(u.CREATOR, parcel, arrayList4, i14, 1);
                }
                if (parcel.readInt() == 0) {
                    z21 = false;
                }
                if (parcel.readInt() != 0) {
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(readInt3);
                    while (i13 != readInt3) {
                        i13 = jr.h.e(v.CREATOR, parcel, arrayList5, i13, 1);
                    }
                    arrayList2 = arrayList5;
                }
                return new x(readString14, arrayList4, z21, arrayList2);
            case 13:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new u(s.CREATOR.createFromParcel(parcel));
            case 14:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z17 = true;
                }
                return new v(readString15, readString16, z17);
            case 15:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new w(parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return new Object();
            case 17:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new fg.c(WithdrawInitiateDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt());
            case 18:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() != 0) {
                    cVar = fg.c.CREATOR.createFromParcel(parcel);
                }
                return new fg.d(cVar, parcel.readString());
            case 19:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString17 = parcel.readString();
                String readString18 = parcel.readString();
                String readString19 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z16 = true;
                }
                return new jg.a(readString17, readString18, readString19, z16);
            case 20:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() != 0) {
                        z15 = true;
                    }
                    valueOf = Boolean.valueOf(z15);
                }
                return new jg.b(readString20, readString21, valueOf, parcel.readString(), parcel.readString(), parcel.readString());
            case 21:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new sh.a(parcel.readString(), parcel.readString(), parcel.readString());
            case 22:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new sh.b(parcel.readString(), parcel.readString());
            case 23:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString22 = parcel.readString();
                String readString23 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt4 = parcel.readInt();
                    arrayList = new ArrayList(readInt4);
                    while (i12 != readInt4) {
                        i12 = jr.h.e(sh.b.CREATOR, parcel, arrayList, i12, 1);
                    }
                }
                return new sh.c(readString22, readString23, arrayList, parcel.readString(), parcel.readString());
            case 24:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new th.a(parcel.readString(), parcel.readString(), parcel.readString());
            case 25:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString24 = parcel.readString();
                String readString25 = parcel.readString();
                String readString26 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z14 = true;
                }
                return new th.b(readString24, readString25, readString26, z14);
            case 26:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString27 = parcel.readString();
                String readString28 = parcel.readString();
                int readInt5 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt5);
                while (i11 != readInt5) {
                    i11 = jr.h.e(th.b.CREATOR, parcel, arrayList6, i11, 1);
                }
                return new th.c(readString27, readString28, arrayList6, parcel.readString(), parcel.readString());
            case 27:
                Intrinsics.checkNotNullParameter(parcel, "in");
                Intrinsics.checkNotNullParameter(parcel, "in");
                ?? obj = new Object();
                obj.f41636a = parcel.readString();
                obj.f41637b = parcel.readString();
                obj.f41638c = parcel.readString();
                obj.f41639d = parcel.readString();
                obj.f41640e = parcel.readString();
                obj.f41641f = parcel.readString();
                obj.f41642g = parcel.readLong();
                return obj;
            case 28:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return di.a.valueOf(parcel.readString());
            default:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new zi.i(parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f18165a) {
            case 0:
                return new f[i10];
            case 1:
                return new g[i10];
            case 2:
                return new h[i10];
            case 3:
                return new s[i10];
            case 4:
                return new m[i10];
            case 5:
                return new k[i10];
            case 6:
                return new l[i10];
            case 7:
                return new n[i10];
            case 8:
                return new o[i10];
            case 9:
                return new q[i10];
            case 10:
                return new p[i10];
            case 11:
                return new r[i10];
            case 12:
                return new x[i10];
            case 13:
                return new u[i10];
            case 14:
                return new v[i10];
            case 15:
                return new w[i10];
            case 16:
                return new dg.d[i10];
            case 17:
                return new fg.c[i10];
            case 18:
                return new fg.d[i10];
            case 19:
                return new jg.a[i10];
            case 20:
                return new jg.b[i10];
            case 21:
                return new sh.a[i10];
            case 22:
                return new sh.b[i10];
            case 23:
                return new sh.c[i10];
            case 24:
                return new th.a[i10];
            case 25:
                return new th.b[i10];
            case 26:
                return new th.c[i10];
            case 27:
                return new yh.a[i10];
            case 28:
                return new di.a[i10];
            default:
                return new zi.i[i10];
        }
    }
}
