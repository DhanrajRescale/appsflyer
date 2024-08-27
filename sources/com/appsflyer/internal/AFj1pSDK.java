package com.appsflyer.internal;

import com.google.android.gms.common.api.Api;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFj1pSDK extends FilterInputStream {
    private final int AFLogger;
    private int afInfoLog;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f8517d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[][] f8518e;
    private final byte[] force;

    /* renamed from: i, reason: collision with root package name */
    private int f8519i;
    private final int[] registerClient;
    private final byte[] unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private int f8520v;
    private static final byte[] AFInAppEventParameterName = AFj1hSDK.AFKeystoreWrapper;
    private static final int[] valueOf = AFj1hSDK.AFInAppEventType;
    private static final int[] AFInAppEventType = AFj1hSDK.valueOf;
    private static final int[] AFKeystoreWrapper = AFj1hSDK.AFInAppEventParameterName;
    private static final int[] values = AFj1hSDK.values;

    public AFj1pSDK(InputStream inputStream, int i10, byte[] bArr, byte[][] bArr2) {
        super(new BufferedInputStream(inputStream, 4096));
        this.registerClient = new int[4];
        this.unregisterClient = new byte[16];
        this.force = new byte[16];
        this.afInfoLog = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f8520v = 16;
        this.f8519i = 16;
        this.AFLogger = i10;
        this.f8517d = AFj1hSDK.values(bArr, i10);
        this.f8518e = valueOf(bArr2);
    }

    private void AFInAppEventParameterName(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.registerClient;
        char c10 = 1;
        int i10 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.f8517d;
        iArr[0] = i10 ^ iArr2[0];
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        iArr[3] = iArr2[3] ^ (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i11 = 4;
        int i12 = 1;
        while (i12 < this.AFLogger) {
            int[] iArr3 = valueOf;
            int[] iArr4 = this.registerClient;
            byte[][] bArr3 = this.f8518e;
            byte[] bArr4 = bArr3[0];
            int i13 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = AFInAppEventType;
            byte[] bArr5 = bArr3[c10];
            int i14 = i13 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = AFKeystoreWrapper;
            byte[] bArr6 = bArr3[2];
            int i15 = iArr6[(iArr4[bArr6[0]] >>> 8) & 255] ^ i14;
            int[] iArr7 = values;
            byte[] bArr7 = bArr3[3];
            int i16 = iArr7[iArr4[bArr7[0]] & 255] ^ i15;
            int[] iArr8 = this.f8517d;
            int i17 = i16 ^ iArr8[i11];
            int i18 = ((iArr6[(iArr4[bArr6[c10]] >>> 8) & 255] ^ (iArr3[iArr4[bArr4[c10]] >>> 24] ^ iArr5[(iArr4[bArr5[c10]] >>> 16) & 255])) ^ iArr7[iArr4[bArr7[c10]] & 255]) ^ iArr8[i11 + 1];
            int i19 = (((iArr5[(iArr4[bArr5[2]] >>> 16) & 255] ^ iArr3[iArr4[bArr4[2]] >>> 24]) ^ iArr6[(iArr4[bArr6[2]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[2]] & 255]) ^ iArr8[i11 + 2];
            int i20 = (((iArr3[iArr4[bArr4[3]] >>> 24] ^ iArr5[(iArr4[bArr5[3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[3]] & 255]) ^ iArr8[i11 + 3];
            iArr4[0] = i17;
            iArr4[1] = i18;
            iArr4[2] = i19;
            iArr4[3] = i20;
            i12++;
            i11 += 4;
            c10 = 1;
        }
        int[] iArr9 = this.f8517d;
        int i21 = iArr9[i11];
        byte[] bArr8 = AFInAppEventParameterName;
        int[] iArr10 = this.registerClient;
        byte[][] bArr9 = this.f8518e;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i21 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i21 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i21 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[3] = (byte) (bArr8[iArr10[bArr13[0]] & 255] ^ i21);
        int i22 = iArr9[i11 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i22 >>> 24));
        bArr2[5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i22 >>> 16));
        bArr2[6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i22 >>> 8));
        bArr2[7] = (byte) (i22 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i23 = iArr9[i11 + 2];
        bArr2[8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i23 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i23 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i23 >>> 8));
        bArr2[11] = (byte) (i23 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i24 = iArr9[i11 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i24 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i24 >>> 16));
        bArr2[14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i24 >>> 8));
        bArr2[15] = (byte) (i24 ^ bArr8[iArr10[bArr13[3]] & 255]);
    }

    private int AFKeystoreWrapper() throws IOException {
        if (this.afInfoLog == Integer.MAX_VALUE) {
            this.afInfoLog = ((FilterInputStream) this).in.read();
        }
        int i10 = 16;
        if (this.f8520v == 16) {
            byte[] bArr = this.unregisterClient;
            int i11 = this.afInfoLog;
            bArr[0] = (byte) i11;
            if (i11 >= 0) {
                int i12 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.unregisterClient, i12, 16 - i12);
                    if (read <= 0) {
                        break;
                    }
                    i12 += read;
                } while (i12 < 16);
                if (i12 >= 16) {
                    AFInAppEventParameterName(this.unregisterClient, this.force);
                    int read2 = ((FilterInputStream) this).in.read();
                    this.afInfoLog = read2;
                    this.f8520v = 0;
                    if (read2 < 0) {
                        i10 = 16 - (this.force[15] & 255);
                    }
                    this.f8519i = i10;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.f8519i;
    }

    private static byte[][] valueOf(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = new byte[bArr[i10].length];
            int i11 = 0;
            while (true) {
                byte[] bArr3 = bArr[i10];
                if (i11 < bArr3.length) {
                    bArr2[i10][bArr3[i11]] = (byte) i11;
                    i11++;
                }
            }
        }
        return bArr2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFKeystoreWrapper();
        return this.f8519i - this.f8520v;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFKeystoreWrapper();
        int i10 = this.f8520v;
        if (i10 >= this.f8519i) {
            return -1;
        }
        byte[] bArr = this.force;
        this.f8520v = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            AFKeystoreWrapper();
            int i14 = this.f8520v;
            if (i14 >= this.f8519i) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.force;
            this.f8520v = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
