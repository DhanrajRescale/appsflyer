package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Deprecated
/* loaded from: classes.dex */
public final class AFb1ySDK {

    /* loaded from: classes.dex */
    public static final class AFa1tSDK implements IInterface {
        private final IBinder AFInAppEventType;

        public AFa1tSDK(IBinder iBinder) {
            this.AFInAppEventType = iBinder;
        }

        public final String AFInAppEventParameterName() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.AFInAppEventType.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final boolean AFKeystoreWrapper() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z10 = true;
                obtain.writeInt(1);
                this.AFInAppEventType.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z10 = false;
                }
                return z10;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.AFInAppEventType;
        }
    }

    /* loaded from: classes.dex */
    public static final class AFa1uSDK {
        public final String AFKeystoreWrapper;
        private final boolean valueOf;

        public AFa1uSDK(String str, boolean z10) {
            this.AFKeystoreWrapper = str;
            this.valueOf = z10;
        }

        public final boolean valueOf() {
            return this.valueOf;
        }
    }

    public static AFa1uSDK values(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            AFa1zSDK aFa1zSDK = new AFa1zSDK((byte) 0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, aFa1zSDK, 1)) {
                    if (!aFa1zSDK.AFInAppEventType) {
                        aFa1zSDK.AFInAppEventType = true;
                        IBinder poll = aFa1zSDK.values.poll(10L, TimeUnit.SECONDS);
                        if (poll != null) {
                            AFa1tSDK aFa1tSDK = new AFa1tSDK(poll);
                            return new AFa1uSDK(aFa1tSDK.AFInAppEventParameterName(), aFa1tSDK.AFKeystoreWrapper());
                        }
                        throw new TimeoutException("Timed out waiting for the service connection");
                    }
                    throw new IllegalStateException("Cannot call get on this connection more than once");
                }
                context.unbindService(aFa1zSDK);
                throw new IOException("Google Play connection failed");
            } finally {
                context.unbindService(aFa1zSDK);
            }
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    /* loaded from: classes.dex */
    public static final class AFa1zSDK implements ServiceConnection {
        boolean AFInAppEventType;
        final LinkedBlockingQueue<IBinder> values;

        private AFa1zSDK() {
            this.values = new LinkedBlockingQueue<>(1);
            this.AFInAppEventType = false;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.values.put(iBinder);
            } catch (InterruptedException e10) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e10);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        public /* synthetic */ AFa1zSDK(byte b10) {
            this();
        }
    }
}
