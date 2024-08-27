package xl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class b extends Binder implements c {
    /* JADX WARN: Type inference failed for: r0v2, types: [xl.c, java.lang.Object, xl.a] */
    public static c i(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
            return (c) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.f40488a = iBinder;
        return obj;
    }
}
