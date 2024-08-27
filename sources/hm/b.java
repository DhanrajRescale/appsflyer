package hm;

import android.app.Activity;
import android.app.Application;
import com.google.android.gms.auth.api.credentials.Credentials;
import com.google.android.gms.auth.api.credentials.CredentialsClient;
import com.google.android.gms.auth.api.credentials.CredentialsOptions;

/* loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static CredentialsClient a(Application application) {
        CredentialsOptions zze = new CredentialsOptions.Builder().forceEnableSaveDialog().zze();
        if (application instanceof Activity) {
            return Credentials.getClient((Activity) application, zze);
        }
        return Credentials.getClient(application, zze);
    }
}
