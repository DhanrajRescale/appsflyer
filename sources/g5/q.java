package g5;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import e5.x;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class q extends b {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f16612e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f16613f;

    /* renamed from: g, reason: collision with root package name */
    public long f16614g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16615h;

    @Override // g5.f
    public final void close() {
        this.f16613f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f16612e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new DataSourceException(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, e10);
            }
        } finally {
            this.f16612e = null;
            if (this.f16615h) {
                this.f16615h = false;
                q();
            }
        }
    }

    @Override // g5.f
    public final Uri l() {
        return this.f16613f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r1 != false) goto L39;
     */
    @Override // g5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long o(g5.i r9) {
        /*
            r8 = this;
            android.net.Uri r0 = r9.f16569a
            long r1 = r9.f16574f
            r8.f16613f = r0
            r8.r()
            r3 = 2000(0x7d0, float:2.803E-42)
            r4 = 2006(0x7d6, float:2.811E-42)
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            java.lang.String r6 = r0.getPath()     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            r6.getClass()     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            java.lang.String r7 = "r"
            r5.<init>(r6, r7)     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            r8.f16612e = r5
            r5.seek(r1)     // Catch: java.io.IOException -> L30
            long r4 = r9.f16575g     // Catch: java.io.IOException -> L30
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L32
            java.io.RandomAccessFile r0 = r8.f16612e     // Catch: java.io.IOException -> L30
            long r4 = r0.length()     // Catch: java.io.IOException -> L30
            long r4 = r4 - r1
            goto L32
        L30:
            r9 = move-exception
            goto L4c
        L32:
            r8.f16614g = r4     // Catch: java.io.IOException -> L30
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L43
            r0 = 1
            r8.f16615h = r0
            r8.s(r9)
            long r0 = r8.f16614g
            return r0
        L43:
            androidx.media3.datasource.FileDataSource$FileDataSourceException r9 = new androidx.media3.datasource.FileDataSource$FileDataSourceException
            r0 = 2008(0x7d8, float:2.814E-42)
            r1 = 0
            r9.<init>(r0, r1, r1)
            throw r9
        L4c:
            androidx.media3.datasource.FileDataSource$FileDataSourceException r0 = new androidx.media3.datasource.FileDataSource$FileDataSourceException
            r0.<init>(r3, r9)
            throw r0
        L52:
            r9 = move-exception
            goto L58
        L54:
            r9 = move-exception
            goto L5e
        L56:
            r9 = move-exception
            goto L64
        L58:
            androidx.media3.datasource.FileDataSource$FileDataSourceException r0 = new androidx.media3.datasource.FileDataSource$FileDataSourceException
            r0.<init>(r3, r9)
            throw r0
        L5e:
            androidx.media3.datasource.FileDataSource$FileDataSourceException r0 = new androidx.media3.datasource.FileDataSource$FileDataSourceException
            r0.<init>(r4, r9)
            throw r0
        L64:
            java.lang.String r1 = r0.getQuery()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L91
            java.lang.String r1 = r0.getFragment()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L91
            androidx.media3.datasource.FileDataSource$FileDataSourceException r0 = new androidx.media3.datasource.FileDataSource$FileDataSourceException
            int r1 = e5.x.f15050a
            r2 = 21
            if (r1 < r2) goto L8b
            java.lang.Throwable r1 = r9.getCause()
            boolean r1 = g5.p.a(r1)
            if (r1 == 0) goto L8b
            goto L8d
        L8b:
            r4 = 2005(0x7d5, float:2.81E-42)
        L8d:
            r0.<init>(r4, r9)
            throw r0
        L91:
            androidx.media3.datasource.FileDataSource$FileDataSourceException r1 = new androidx.media3.datasource.FileDataSource$FileDataSourceException
            java.lang.String r2 = r0.getPath()
            java.lang.String r3 = r0.getQuery()
            java.lang.String r0 = r0.getFragment()
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r3, r0}
            java.lang.String r2 = "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r2 = 1004(0x3ec, float:1.407E-42)
            r1.<init>(r2, r0, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.q.o(g5.i):long");
    }

    @Override // b5.o
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f16614g;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f16612e;
            int i12 = x.f15050a;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (read > 0) {
                this.f16614g -= read;
                p(read);
            }
            return read;
        } catch (IOException e10) {
            throw new DataSourceException(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, e10);
        }
    }
}
