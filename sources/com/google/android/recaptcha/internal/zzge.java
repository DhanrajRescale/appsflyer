package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzge {
    private static final zzge zzb = new zzge(true);
    final zziy zza = new zzio(16);
    private boolean zzc;
    private boolean zzd;

    private zzge() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x002d. Please report as an issue. */
    public static int zza(zzgd zzgdVar, Object obj) {
        int zzd;
        int zzy;
        zzjv zzd2 = zzgdVar.zzd();
        int zza = zzgdVar.zza();
        zzgdVar.zzg();
        int zzy2 = zzfk.zzy(zza << 3);
        if (zzd2 == zzjv.zzj) {
            zzhy zzhyVar = (zzhy) obj;
            byte[] bArr = zzgw.zzd;
            if (!(zzhyVar instanceof zzej)) {
                zzy2 += zzy2;
            } else {
                throw null;
            }
        }
        zzjw zzjwVar = zzjw.INT;
        int i10 = 4;
        switch (zzd2.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                i10 = 8;
                return zzy2 + i10;
            case 1:
                ((Float) obj).floatValue();
                return zzy2 + i10;
            case 2:
                i10 = zzfk.zzz(((Long) obj).longValue());
                return zzy2 + i10;
            case 3:
                i10 = zzfk.zzz(((Long) obj).longValue());
                return zzy2 + i10;
            case 4:
                i10 = zzfk.zzu(((Integer) obj).intValue());
                return zzy2 + i10;
            case 5:
                ((Long) obj).longValue();
                i10 = 8;
                return zzy2 + i10;
            case 6:
                ((Integer) obj).intValue();
                return zzy2 + i10;
            case 7:
                ((Boolean) obj).booleanValue();
                i10 = 1;
                return zzy2 + i10;
            case 8:
                if (obj instanceof zzez) {
                    zzd = ((zzez) obj).zzd();
                    zzy = zzfk.zzy(zzd);
                    i10 = zzy + zzd;
                    return zzy2 + i10;
                }
                i10 = zzfk.zzx((String) obj);
                return zzy2 + i10;
            case 9:
                i10 = ((zzhy) obj).zzn();
                return zzy2 + i10;
            case 10:
                if (obj instanceof zzhd) {
                    zzd = ((zzhd) obj).zza();
                    zzy = zzfk.zzy(zzd);
                    i10 = zzy + zzd;
                    return zzy2 + i10;
                }
                i10 = zzfk.zzv((zzhy) obj);
                return zzy2 + i10;
            case 11:
                if (obj instanceof zzez) {
                    zzd = ((zzez) obj).zzd();
                    zzy = zzfk.zzy(zzd);
                } else {
                    zzd = ((byte[]) obj).length;
                    zzy = zzfk.zzy(zzd);
                }
                i10 = zzy + zzd;
                return zzy2 + i10;
            case 12:
                i10 = zzfk.zzy(((Integer) obj).intValue());
                return zzy2 + i10;
            case 13:
                i10 = obj instanceof zzgq ? zzfk.zzu(((zzgq) obj).zza()) : zzfk.zzu(((Integer) obj).intValue());
                return zzy2 + i10;
            case 14:
                ((Integer) obj).intValue();
                return zzy2 + i10;
            case 15:
                ((Long) obj).longValue();
                i10 = 8;
                return zzy2 + i10;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i10 = zzfk.zzy((intValue >> 31) ^ (intValue + intValue));
                return zzy2 + i10;
            case 17:
                long longValue = ((Long) obj).longValue();
                i10 = zzfk.zzz((longValue >> 63) ^ (longValue + longValue));
                return zzy2 + i10;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zzge zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzid) {
            return ((zzid) obj).zzd();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return obj;
    }

    private final void zzm(Map.Entry entry) {
        zzhy zzj;
        zzgd zzgdVar = (zzgd) entry.getKey();
        Object value = entry.getValue();
        if (!(value instanceof zzhd)) {
            zzgdVar.zzg();
            if (zzgdVar.zze() == zzjw.MESSAGE) {
                Object zze = zze(zzgdVar);
                if (zze == null) {
                    this.zza.put(zzgdVar, zzl(value));
                    return;
                }
                if (zze instanceof zzid) {
                    zzj = zzgdVar.zzc((zzid) zze, (zzid) value);
                } else {
                    zzhx zzW = ((zzhy) zze).zzW();
                    zzgdVar.zzb(zzW, (zzhy) value);
                    zzj = zzW.zzj();
                }
                this.zza.put(zzgdVar, zzj);
                return;
            }
            this.zza.put(zzgdVar, zzl(value));
            return;
        }
        throw null;
    }

    private static boolean zzn(Map.Entry entry) {
        zzgd zzgdVar = (zzgd) entry.getKey();
        if (zzgdVar.zze() != zzjw.MESSAGE) {
            return true;
        }
        zzgdVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzhz) {
            return ((zzhz) value).zzo();
        }
        if (value instanceof zzhd) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        zzgd zzgdVar = (zzgd) entry.getKey();
        Object value = entry.getValue();
        if (zzgdVar.zze() == zzjw.MESSAGE) {
            zzgdVar.zzg();
            zzgdVar.zzf();
            if (value instanceof zzhd) {
                int zzy = zzfk.zzy(((zzgd) entry.getKey()).zza());
                int zza = ((zzhd) value).zza();
                int zzy2 = zzfk.zzy(zza) + zza;
                int zzy3 = zzfk.zzy(24);
                int zzy4 = zzfk.zzy(16);
                int zzy5 = zzfk.zzy(8);
                return zzy3 + zzy2 + zzy4 + zzy + zzy5 + zzy5;
            }
            int zzy6 = zzfk.zzy(((zzgd) entry.getKey()).zza());
            int zzy7 = zzfk.zzy(24) + zzfk.zzv((zzhy) value);
            int zzy8 = zzfk.zzy(16);
            int zzy9 = zzfk.zzy(8);
            return zzy8 + zzy6 + zzy9 + zzy9 + zzy7;
        }
        return zza(zzgdVar, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzge)) {
            return false;
        }
        return this.zza.equals(((zzge) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.zza.zzb(); i11++) {
            i10 += zzo(this.zza.zzg(i11));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            i10 += zzo((Map.Entry) it.next());
        }
        return i10;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzge clone() {
        zzge zzgeVar = new zzge();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            zzgeVar.zzi((zzgd) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzgeVar.zzi((zzgd) entry.getKey(), entry.getValue());
        }
        zzgeVar.zzd = this.zzd;
        return zzgeVar;
    }

    public final Object zze(zzgd zzgdVar) {
        Object obj = this.zza.get(zzgdVar);
        if (!(obj instanceof zzhd)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzf() {
        if (this.zzd) {
            return new zzhc(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (!this.zzc) {
            for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
                Map.Entry zzg = this.zza.zzg(i10);
                if (zzg.getValue() instanceof zzgo) {
                    ((zzgo) zzg.getValue()).zzA();
                }
            }
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzh(zzge zzgeVar) {
        for (int i10 = 0; i10 < zzgeVar.zza.zzb(); i10++) {
            zzm(zzgeVar.zza.zzg(i10));
        }
        Iterator it = zzgeVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zzgq) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zzhd) == false) goto L32;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0018. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(com.google.android.recaptcha.internal.zzgd r3, java.lang.Object r4) {
        /*
            r2 = this;
            r3.zzg()
            com.google.android.recaptcha.internal.zzjv r0 = r3.zzd()
            byte[] r1 = com.google.android.recaptcha.internal.zzgw.zzd
            r4.getClass()
            com.google.android.recaptcha.internal.zzjv r1 = com.google.android.recaptcha.internal.zzjv.zza
            com.google.android.recaptcha.internal.zzjw r1 = com.google.android.recaptcha.internal.zzjw.INT
            com.google.android.recaptcha.internal.zzjw r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L46;
                case 1: goto L43;
                case 2: goto L40;
                case 3: goto L3d;
                case 4: goto L3a;
                case 5: goto L37;
                case 6: goto L2e;
                case 7: goto L25;
                case 8: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L57
        L1c:
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzhy
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzhd
            if (r0 == 0) goto L57
            goto L4a
        L25:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzgq
            if (r0 == 0) goto L57
            goto L4a
        L2e:
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzez
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L57
            goto L4a
        L37:
            boolean r0 = r4 instanceof java.lang.String
            goto L48
        L3a:
            boolean r0 = r4 instanceof java.lang.Boolean
            goto L48
        L3d:
            boolean r0 = r4 instanceof java.lang.Double
            goto L48
        L40:
            boolean r0 = r4 instanceof java.lang.Float
            goto L48
        L43:
            boolean r0 = r4 instanceof java.lang.Long
            goto L48
        L46:
            boolean r0 = r4 instanceof java.lang.Integer
        L48:
            if (r0 == 0) goto L57
        L4a:
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzhd
            if (r0 == 0) goto L51
            r0 = 1
            r2.zzd = r0
        L51:
            com.google.android.recaptcha.internal.zziy r0 = r2.zza
            r0.put(r3, r4)
            return
        L57:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.recaptcha.internal.zzjv r3 = r3.zzd()
            com.google.android.recaptcha.internal.zzjw r3 = r3.zza()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzge.zzi(com.google.android.recaptcha.internal.zzgd, java.lang.Object):void");
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            if (!zzn(this.zza.zzg(i10))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzge(boolean z10) {
        zzg();
        zzg();
    }
}
