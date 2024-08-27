package g5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.datasource.ContentDataSource$ContentDataSourceException;
import androidx.media3.datasource.DataSourceException;
import com.airbnb.deeplinkdispatch.base.MatchIndex;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import e5.x;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f16543e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f16544f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f16545g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f16546h;

    /* renamed from: i, reason: collision with root package name */
    public long f16547i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16548j;

    public c(Context context) {
        super(false);
        this.f16543e = context.getContentResolver();
    }

    @Override // g5.f
    public final void close() {
        this.f16544f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f16546h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f16546h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f16545g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new DataSourceException(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, e10);
                    }
                } finally {
                    this.f16545g = null;
                    if (this.f16548j) {
                        this.f16548j = false;
                        q();
                    }
                }
            } catch (Throwable th2) {
                this.f16546h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f16545g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f16545g = null;
                        if (this.f16548j) {
                            this.f16548j = false;
                            q();
                        }
                        throw th2;
                    } finally {
                        this.f16545g = null;
                        if (this.f16548j) {
                            this.f16548j = false;
                            q();
                        }
                    }
                } catch (IOException e11) {
                    throw new DataSourceException(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, e11);
                }
            }
        } catch (IOException e12) {
            throw new DataSourceException(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, e12);
        }
    }

    @Override // g5.f
    public final Uri l() {
        return this.f16544f;
    }

    @Override // g5.f
    public final long o(i iVar) {
        AssetFileDescriptor openAssetFileDescriptor;
        long min;
        int i10 = CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
        try {
            Uri normalizeScheme = iVar.f16569a.normalizeScheme();
            this.f16544f = normalizeScheme;
            r();
            boolean equals = "content".equals(normalizeScheme.getScheme());
            ContentResolver contentResolver = this.f16543e;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, MatchIndex.ROOT_VALUE);
            }
            this.f16545g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f16546h = fileInputStream;
                long j10 = iVar.f16574f;
                if (length != -1 && j10 > length) {
                    throw new DataSourceException(2008, (Throwable) null);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j10) - startOffset;
                if (skip == j10) {
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f16547i = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f16547i = position;
                            if (position < 0) {
                                throw new DataSourceException(2008, (Throwable) null);
                            }
                        }
                    } else {
                        long j11 = length - skip;
                        this.f16547i = j11;
                        if (j11 < 0) {
                            throw new DataSourceException(2008, (Throwable) null);
                        }
                    }
                    long j12 = iVar.f16575g;
                    if (j12 != -1) {
                        long j13 = this.f16547i;
                        if (j13 == -1) {
                            min = j12;
                        } else {
                            min = Math.min(j13, j12);
                        }
                        this.f16547i = min;
                    }
                    this.f16548j = true;
                    s(iVar);
                    if (j12 == -1) {
                        return this.f16547i;
                    }
                    return j12;
                }
                throw new DataSourceException(2008, (Throwable) null);
            }
            throw new DataSourceException(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, new IOException("Could not open file descriptor for: " + normalizeScheme));
        } catch (ContentDataSource$ContentDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i10 = 2005;
            }
            throw new DataSourceException(i10, e11);
        }
    }

    @Override // b5.o
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f16547i;
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
        FileInputStream fileInputStream = this.f16546h;
        int i12 = x.f15050a;
        int read = fileInputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f16547i;
        if (j11 != -1) {
            this.f16547i = j11 - read;
        }
        p(read);
        return read;
    }
}
