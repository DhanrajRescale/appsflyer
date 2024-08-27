package com.appsflyer.internal;

import com.airbnb.deeplinkdispatch.MetadataMasks;
import com.google.android.gms.common.api.Api;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFj1jSDK extends FilterInputStream {
    private static final short AFInAppEventParameterName = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
    private int AFInAppEventType;
    private byte[] AFKeystoreWrapper;
    private int AFLogger;
    private int afInfoLog;

    /* renamed from: d, reason: collision with root package name */
    private int f8511d;

    /* renamed from: e, reason: collision with root package name */
    private int f8512e;

    /* renamed from: i, reason: collision with root package name */
    private int f8513i;
    private int registerClient;
    private int unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private int f8514v;
    private byte[] valueOf;
    private byte[] values;

    public AFj1jSDK(InputStream inputStream, int[] iArr, int i10, byte[] bArr, int i11, int i12) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.AFLogger = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.values = new byte[8];
        this.AFKeystoreWrapper = new byte[8];
        this.valueOf = new byte[8];
        this.AFInAppEventType = 8;
        this.f8512e = 8;
        this.registerClient = Math.min(Math.max(i11, 5), 16);
        this.f8511d = i12;
        if (i12 == 3) {
            System.arraycopy(bArr, 0, this.AFKeystoreWrapper, 0, 8);
        }
        long j10 = ((iArr[0] & 4294967295L) << 32) | (4294967295L & iArr[1]);
        if (i10 == 0) {
            this.unregisterClient = (int) j10;
            long j11 = j10 >> 3;
            short s7 = AFInAppEventParameterName;
            this.f8513i = (int) ((s7 * j11) >> 32);
            this.f8514v = (int) (j10 >> 32);
            this.afInfoLog = (int) (j11 + s7);
            return;
        }
        int i13 = (int) j10;
        this.unregisterClient = i13;
        this.f8513i = i13 * i10;
        this.f8514v = i13 ^ i10;
        this.afInfoLog = (int) (j10 >> 32);
    }

    private int AFInAppEventType() throws IOException {
        if (this.AFLogger == Integer.MAX_VALUE) {
            this.AFLogger = ((FilterInputStream) this).in.read();
        }
        int i10 = 8;
        if (this.AFInAppEventType == 8) {
            byte[] bArr = this.values;
            int i11 = this.AFLogger;
            bArr[0] = (byte) i11;
            if (i11 >= 0) {
                int i12 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.values, i12, 8 - i12);
                    if (read <= 0) {
                        break;
                    }
                    i12 += read;
                } while (i12 < 8);
                if (i12 >= 8) {
                    valueOf();
                    int read2 = ((FilterInputStream) this).in.read();
                    this.AFLogger = read2;
                    this.AFInAppEventType = 0;
                    if (read2 < 0) {
                        i10 = 8 - (this.values[7] & 255);
                    }
                    this.f8512e = i10;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.f8512e;
    }

    private void valueOf() {
        if (this.f8511d == 3) {
            byte[] bArr = this.values;
            System.arraycopy(bArr, 0, this.valueOf, 0, bArr.length);
        }
        byte[] bArr2 = this.values;
        int i10 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << MetadataMasks.ComponentParamMask) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i11 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << MetadataMasks.ComponentParamMask)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i12 = 0;
        while (true) {
            int i13 = this.registerClient;
            if (i12 >= i13) {
                break;
            }
            short s7 = AFInAppEventParameterName;
            i11 -= ((((i13 - i12) * s7) + i10) ^ ((i10 << 4) + this.f8514v)) ^ ((i10 >>> 5) + this.afInfoLog);
            i10 -= (((i11 << 4) + this.unregisterClient) ^ (((i13 - i12) * s7) + i11)) ^ ((i11 >>> 5) + this.f8513i);
            i12++;
        }
        byte[] bArr3 = this.values;
        bArr3[0] = (byte) (i10 >> 24);
        bArr3[1] = (byte) (i10 >> 16);
        bArr3[2] = (byte) (i10 >> 8);
        bArr3[3] = (byte) i10;
        bArr3[4] = (byte) (i11 >> 24);
        bArr3[5] = (byte) (i11 >> 16);
        bArr3[6] = (byte) (i11 >> 8);
        bArr3[7] = (byte) i11;
        if (this.f8511d == 3) {
            for (int i14 = 0; i14 < 8; i14++) {
                byte[] bArr4 = this.values;
                bArr4[i14] = (byte) (bArr4[i14] ^ this.AFKeystoreWrapper[i14]);
            }
            byte[] bArr5 = this.valueOf;
            System.arraycopy(bArr5, 0, this.AFKeystoreWrapper, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFInAppEventType();
        return this.f8512e - this.AFInAppEventType;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFInAppEventType();
        int i10 = this.AFInAppEventType;
        if (i10 >= this.f8512e) {
            return -1;
        }
        byte[] bArr = this.values;
        this.AFInAppEventType = i10 + 1;
        return bArr[i10] & 255;
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
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            AFInAppEventType();
            int i14 = this.AFInAppEventType;
            if (i14 >= this.f8512e) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.values;
            this.AFInAppEventType = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
