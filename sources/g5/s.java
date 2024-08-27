package g5;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import e5.x;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class s extends b {

    /* renamed from: e, reason: collision with root package name */
    public final Resources f16618e;

    /* renamed from: f, reason: collision with root package name */
    public final String f16619f;

    /* renamed from: g, reason: collision with root package name */
    public Uri f16620g;

    /* renamed from: h, reason: collision with root package name */
    public AssetFileDescriptor f16621h;

    /* renamed from: i, reason: collision with root package name */
    public FileInputStream f16622i;

    /* renamed from: j, reason: collision with root package name */
    public long f16623j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16624k;

    public s(Context context) {
        super(false);
        this.f16618e = context.getResources();
        this.f16619f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // g5.f
    public final void close() {
        this.f16620g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f16622i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f16622i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f16621h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new DataSourceException(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, null, e10);
                    }
                } finally {
                    this.f16621h = null;
                    if (this.f16624k) {
                        this.f16624k = false;
                        q();
                    }
                }
            } catch (Throwable th2) {
                this.f16622i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f16621h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f16621h = null;
                        if (this.f16624k) {
                            this.f16624k = false;
                            q();
                        }
                        throw th2;
                    } finally {
                        this.f16621h = null;
                        if (this.f16624k) {
                            this.f16624k = false;
                            q();
                        }
                    }
                } catch (IOException e11) {
                    throw new DataSourceException(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, null, e11);
                }
            }
        } catch (IOException e12) {
            throw new DataSourceException(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, null, e12);
        }
    }

    @Override // g5.f
    public final Uri l() {
        return this.f16620g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (r3.matches("\\d+") != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0165  */
    @Override // g5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long o(g5.i r20) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.s.o(g5.i):long");
    }

    @Override // b5.o
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f16623j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new DataSourceException(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, null, e10);
            }
        }
        FileInputStream fileInputStream = this.f16622i;
        int i12 = x.f15050a;
        int read = fileInputStream.read(bArr, i10, i11);
        if (read == -1) {
            if (this.f16623j == -1) {
                return -1;
            }
            throw new DataSourceException(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, "End of stream reached having not read sufficient data.", new EOFException());
        }
        long j11 = this.f16623j;
        if (j11 != -1) {
            this.f16623j = j11 - read;
        }
        p(read);
        return read;
    }
}
