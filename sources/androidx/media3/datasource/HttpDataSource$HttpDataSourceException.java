package androidx.media3.datasource;

import dp.b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {

    /* renamed from: c, reason: collision with root package name */
    public final int f2057c;

    public HttpDataSource$HttpDataSourceException() {
        super(a(2008, 1));
        this.f2057c = 1;
    }

    public static int a(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static HttpDataSource$HttpDataSourceException b(IOException iOException, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else if (message != null && b.P1(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        } else {
            i11 = 2001;
        }
        if (i11 == 2007) {
            return new HttpDataSource$HttpDataSourceException("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007);
        }
        return new HttpDataSource$HttpDataSourceException(iOException, i11, i10);
    }

    public HttpDataSource$HttpDataSourceException(String str, int i10) {
        super(str, a(i10, 1));
        this.f2057c = 1;
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, int i10, int i11) {
        super(a(i10, i11), iOException);
        this.f2057c = i11;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, int i10) {
        super(a(i10, 1), str, iOException);
        this.f2057c = 1;
    }
}
