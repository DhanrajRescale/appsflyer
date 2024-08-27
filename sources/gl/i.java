package gl;

import android.os.AsyncTask;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final String f17469a;

    /* renamed from: b, reason: collision with root package name */
    public final File f17470b;

    /* renamed from: c, reason: collision with root package name */
    public final h f17471c;

    public i(String uriStr, File destFile, h onSuccess) {
        Intrinsics.checkNotNullParameter(uriStr, "uriStr");
        Intrinsics.checkNotNullParameter(destFile, "destFile");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this.f17469a = uriStr;
        this.f17470b = destFile;
        this.f17471c = onSuccess;
    }

    public final Boolean a(String... args) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                URL url = new URL(this.f17469a);
                int contentLength = ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection())).getContentLength();
                DataInputStream dataInputStream = new DataInputStream(FirebasePerfUrlConnection.openStream(url));
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f17470b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            return a((String[]) objArr);
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (!sl.a.b(this) && booleanValue) {
                try {
                    this.f17471c.c(this.f17470b);
                } catch (Throwable th2) {
                    sl.a.a(this, th2);
                }
            }
        } catch (Throwable th3) {
            sl.a.a(this, th3);
        }
    }
}
