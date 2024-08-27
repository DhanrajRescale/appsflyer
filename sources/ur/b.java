package ur;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import mv.d;
import mv.j;

/* loaded from: classes2.dex */
public final class b extends j {

    /* renamed from: c, reason: collision with root package name */
    public final Context f37361c;

    /* renamed from: d, reason: collision with root package name */
    public final String f37362d = "org/threeten/bp/TZDB.dat";

    public b(Context context) {
        this.f37361c = context;
    }

    @Override // mv.j
    public final void a() {
        String str = this.f37362d;
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f37361c.getAssets().open(str);
                d dVar = new d(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                d.c(dVar);
            } catch (IOException e10) {
                throw new IllegalStateException(str + " missing from assets", e10);
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th2;
        }
    }
}
