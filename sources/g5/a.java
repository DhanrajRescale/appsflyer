package g5;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.datasource.AssetDataSource$AssetDataSourceException;
import androidx.media3.datasource.DataSourceException;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import e5.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f16534e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f16535f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f16536g;

    /* renamed from: h, reason: collision with root package name */
    public long f16537h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16538i;

    public a(Context context) {
        super(false);
        this.f16534e = context.getAssets();
    }

    @Override // g5.f
    public final void close() {
        this.f16535f = null;
        try {
            try {
                InputStream inputStream = this.f16536g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new DataSourceException(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, e10);
            }
        } finally {
            this.f16536g = null;
            if (this.f16538i) {
                this.f16538i = false;
                q();
            }
        }
    }

    @Override // g5.f
    public final Uri l() {
        return this.f16535f;
    }

    @Override // g5.f
    public final long o(i iVar) {
        int i10;
        try {
            Uri uri = iVar.f16569a;
            long j10 = iVar.f16574f;
            this.f16535f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            r();
            InputStream open = this.f16534e.open(path, 1);
            this.f16536g = open;
            if (open.skip(j10) >= j10) {
                long j11 = iVar.f16575g;
                if (j11 != -1) {
                    this.f16537h = j11;
                } else {
                    long available = this.f16536g.available();
                    this.f16537h = available;
                    if (available == 2147483647L) {
                        this.f16537h = -1L;
                    }
                }
                this.f16538i = true;
                s(iVar);
                return this.f16537h;
            }
            throw new DataSourceException(2008, (Throwable) null);
        } catch (AssetDataSource$AssetDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i10 = 2005;
            } else {
                i10 = CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
            }
            throw new DataSourceException(i10, e11);
        }
    }

    @Override // b5.o
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f16537h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new DataSourceException(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, e10);
            }
        }
        InputStream inputStream = this.f16536g;
        int i12 = x.f15050a;
        int read = inputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f16537h;
        if (j11 != -1) {
            this.f16537h = j11 - read;
        }
        p(read);
        return read;
    }
}
