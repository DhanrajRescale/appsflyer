package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcx;
import com.google.android.gms.internal.icing.zzda;

/* loaded from: classes2.dex */
public class zzcx<MessageType extends zzda<MessageType, BuilderType>, BuilderType extends zzcx<MessageType, BuilderType>> extends zzbr<MessageType, BuilderType> {
    protected MessageType zza;
    protected boolean zzb = false;
    private final MessageType zzc;

    public zzcx(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (MessageType) messagetype.zzf(4, null, null);
    }

    private static final void zza(MessageType messagetype, MessageType messagetype2) {
        zzem.zza().zzb(messagetype.getClass()).zzc(messagetype, messagetype2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.icing.zzbr
    public final /* bridge */ /* synthetic */ zzbr zze(zzbs zzbsVar) {
        zzk((zzda) zzbsVar);
        return this;
    }

    public void zzg() {
        MessageType messagetype = (MessageType) this.zza.zzf(4, null, null);
        zza(messagetype, this.zza);
        this.zza = messagetype;
    }

    @Override // com.google.android.gms.internal.icing.zzbr
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final BuilderType clone() {
        BuilderType buildertype = (BuilderType) this.zzc.zzf(5, null, null);
        buildertype.zzk(zzl());
        return buildertype;
    }

    @Override // com.google.android.gms.internal.icing.zzed
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public MessageType zzl() {
        if (this.zzb) {
            return this.zza;
        }
        MessageType messagetype = this.zza;
        zzem.zza().zzb(messagetype.getClass()).zze(messagetype);
        this.zzb = true;
        return this.zza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final MessageType zzj() {
        /*
            r5 = this;
            com.google.android.gms.internal.icing.zzda r0 = r5.zzl()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.zzf(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L13
            goto L30
        L13:
            if (r3 == 0) goto L31
            com.google.android.gms.internal.icing.zzem r3 = com.google.android.gms.internal.icing.zzem.zza()
            java.lang.Class r4 = r0.getClass()
            com.google.android.gms.internal.icing.zzep r3 = r3.zzb(r4)
            boolean r3 = r3.zzf(r0)
            if (r1 == r3) goto L29
            r1 = r2
            goto L2a
        L29:
            r1 = r0
        L2a:
            r4 = 2
            r0.zzf(r4, r1, r2)
            if (r3 == 0) goto L31
        L30:
            return r0
        L31:
            com.google.android.gms.internal.icing.zzfc r1 = new com.google.android.gms.internal.icing.zzfc
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzcx.zzj():com.google.android.gms.internal.icing.zzda");
    }

    public final BuilderType zzk(MessageType messagetype) {
        if (this.zzb) {
            zzg();
            this.zzb = false;
        }
        zza(this.zza, messagetype);
        return this;
    }

    @Override // com.google.android.gms.internal.icing.zzef
    public final /* bridge */ /* synthetic */ zzee zzm() {
        return this.zzc;
    }
}
