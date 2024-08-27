package l7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class q extends Binder implements f {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f24145b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f24146a;

    public q(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f24146a = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // l7.f
    public final void h(String[] strArr, int i10) {
        synchronized (this.f24146a.f2440c) {
            try {
                String str = (String) this.f24146a.f2439b.get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = this.f24146a.f2440c.beginBroadcast();
                for (int i11 = 0; i11 < beginBroadcast; i11++) {
                    try {
                        int intValue = ((Integer) this.f24146a.f2440c.getBroadcastCookie(i11)).intValue();
                        String str2 = (String) this.f24146a.f2439b.get(Integer.valueOf(intValue));
                        if (i10 != intValue && str.equals(str2)) {
                            try {
                                ((d) this.f24146a.f2440c.getBroadcastItem(i11)).b(strArr);
                            } catch (RemoteException e10) {
                                Log.w("ROOM", "Error invoking a remote callback", e10);
                            }
                        }
                    } finally {
                        this.f24146a.f2440c.finishBroadcast();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l7.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [l7.c, java.lang.Object] */
    @Override // android.os.Binder
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        d dVar = null;
        d dVar2 = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 1598968902) {
                        return super.onTransact(i10, parcel, parcel2, i11);
                    }
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                h(parcel.createStringArray(), parcel.readInt());
                return true;
            }
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof d)) {
                    dVar2 = (d) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.f24113a = readStrongBinder;
                    dVar2 = obj;
                }
            }
            int readInt = parcel.readInt();
            synchronized (this.f24146a.f2440c) {
                this.f24146a.f2440c.unregister(dVar2);
                this.f24146a.f2439b.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof d)) {
                dVar = (d) queryLocalInterface2;
            } else {
                ?? obj2 = new Object();
                obj2.f24113a = readStrongBinder2;
                dVar = obj2;
            }
        }
        int j10 = j(dVar, parcel.readString());
        parcel2.writeNoException();
        parcel2.writeInt(j10);
        return true;
    }

    public final int j(d dVar, String str) {
        if (str == null) {
            return 0;
        }
        synchronized (this.f24146a.f2440c) {
            try {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f24146a;
                int i10 = multiInstanceInvalidationService.f2438a + 1;
                multiInstanceInvalidationService.f2438a = i10;
                if (multiInstanceInvalidationService.f2440c.register(dVar, Integer.valueOf(i10))) {
                    this.f24146a.f2439b.put(Integer.valueOf(i10), str);
                    return i10;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f24146a;
                multiInstanceInvalidationService2.f2438a--;
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
