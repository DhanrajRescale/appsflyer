package xk;

import com.facebook.FacebookSdk;
import java.io.File;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        File m12sdkInitialize$lambda3;
        m12sdkInitialize$lambda3 = FacebookSdk.m12sdkInitialize$lambda3();
        return m12sdkInitialize$lambda3;
    }
}
