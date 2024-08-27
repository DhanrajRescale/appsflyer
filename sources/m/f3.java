package m;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class f3 implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25525a;

    public /* synthetic */ f3(int i10) {
        this.f25525a = i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t0.y2, t0.n1] */
    public static t0.n1 a(Parcel parcel, ClassLoader classLoader) {
        t0.z2 z2Var;
        if (classLoader == null) {
            classLoader = f3.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt != 0) {
            if (readInt != 1) {
                if (readInt == 2) {
                    z2Var = t0.g2.f35024a;
                } else {
                    throw new IllegalStateException(jr.h.o("Unsupported MutableState policy ", readInt, " was restored"));
                }
            } else {
                z2Var = t0.o3.f35116a;
            }
        } else {
            z2Var = t0.h1.f35033a;
        }
        return new t0.y2(readValue, z2Var);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [no.m, java.lang.Object, k4.b] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View$BaseSavedState, java.lang.Object, a8.n] */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f25525a) {
            case 0:
                return new g3(parcel, classLoader);
            case 1:
                return new v3(parcel, classLoader);
            case 2:
                return a(parcel, classLoader);
            case 3:
                return new o3.g(parcel, classLoader);
            case 4:
                if (parcel.readParcelable(classLoader) == null) {
                    return k4.b.f22039b;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                return new o4.e(parcel, classLoader);
            case 6:
                return new k7.r1(parcel, classLoader);
            case 7:
                return new x7.g(parcel, classLoader);
            case 8:
                ?? baseSavedState = new View.BaseSavedState(parcel, classLoader);
                baseSavedState.f277a = parcel.readInt();
                baseSavedState.f278b = parcel.readInt();
                baseSavedState.f279c = parcel.readParcelable(classLoader);
                return baseSavedState;
            case 9:
                return new ao.c(parcel, classLoader);
            case 10:
                return new bo.b(parcel, classLoader);
            case 11:
                return new mo.a(parcel, classLoader);
            case 12:
                return new mo.u(parcel, classLoader);
            case 13:
                return new no.j(parcel, classLoader);
            case 14:
                ?? bVar = new k4.b(parcel, classLoader);
                bVar.f29069c = parcel.readBundle(classLoader);
                return bVar;
            case 15:
                return new uo.b(parcel, classLoader);
            case 16:
                return new xo.a(parcel, classLoader);
            default:
                return new zo.x(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f25525a) {
            case 0:
                return new g3[i10];
            case 1:
                return new v3[i10];
            case 2:
                return new t0.n1[i10];
            case 3:
                return new o3.g[i10];
            case 4:
                return new k4.b[i10];
            case 5:
                return new o4.e[i10];
            case 6:
                return new k7.r1[i10];
            case 7:
                return new x7.g[i10];
            case 8:
                return new a8.n[i10];
            case 9:
                return new ao.c[i10];
            case 10:
                return new bo.b[i10];
            case 11:
                return new mo.a[i10];
            case 12:
                return new mo.u[i10];
            case 13:
                return new no.j[i10];
            case 14:
                return new no.m[i10];
            case 15:
                return new uo.b[i10];
            case 16:
                return new xo.a[i10];
            default:
                return new zo.x[i10];
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [no.m, java.lang.Object, k4.b] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.View$BaseSavedState, java.lang.Object, a8.n] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f25525a) {
            case 0:
                return new g3(parcel, null);
            case 1:
                return new v3(parcel, null);
            case 2:
                return a(parcel, null);
            case 3:
                return new o3.g(parcel, null);
            case 4:
                if (parcel.readParcelable(null) == null) {
                    return k4.b.f22039b;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                return new o4.e(parcel, null);
            case 6:
                return new k7.r1(parcel, null);
            case 7:
                return new x7.g(parcel, null);
            case 8:
                ?? baseSavedState = new View.BaseSavedState(parcel, null);
                baseSavedState.f277a = parcel.readInt();
                baseSavedState.f278b = parcel.readInt();
                baseSavedState.f279c = parcel.readParcelable(null);
                return baseSavedState;
            case 9:
                return new ao.c(parcel, (ClassLoader) null);
            case 10:
                return new bo.b(parcel, null);
            case 11:
                return new mo.a(parcel, null);
            case 12:
                return new mo.u(parcel, null);
            case 13:
                return new no.j(parcel, null);
            case 14:
                ?? bVar = new k4.b(parcel, null);
                bVar.f29069c = parcel.readBundle(null);
                return bVar;
            case 15:
                return new uo.b(parcel, (ClassLoader) null);
            case 16:
                return new xo.a(parcel, null);
            default:
                return new zo.x(parcel, null);
        }
    }
}
