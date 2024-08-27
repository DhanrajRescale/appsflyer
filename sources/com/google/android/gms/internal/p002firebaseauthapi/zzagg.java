package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzagg;
import com.google.android.gms.internal.p002firebaseauthapi.zzagk;

/* loaded from: classes2.dex */
public class zzagg<MessageType extends zzagk<MessageType, BuilderType>, BuilderType extends zzagg<MessageType, BuilderType>> extends zzaeo<MessageType, BuilderType> {
    protected zzagk zza;
    private final zzagk zzb;

    public zzagg(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzL()) {
            this.zza = messagetype.zzw();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static void zza(Object obj, Object obj2) {
        zzahx.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahq
    public final /* synthetic */ zzahp zzM() {
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeo
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzagg clone() {
        zzagg zzaggVar = (zzagg) this.zzb.zzj(5, null, null);
        zzaggVar.zza = zzk();
        return zzaggVar;
    }

    public final zzagg zzh(zzagk zzagkVar) {
        if (!this.zzb.equals(zzagkVar)) {
            if (!this.zza.zzL()) {
                zzn();
            }
            zza(this.zza, zzagkVar);
        }
        return this;
    }

    public final MessageType zzi() {
        MessageType zzk = zzk();
        if (zzk.zzK()) {
            return zzk;
        }
        throw new zzaiu(zzk);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaho
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public MessageType zzk() {
        if (!this.zza.zzL()) {
            return (MessageType) this.zza;
        }
        this.zza.zzF();
        return (MessageType) this.zza;
    }

    public final void zzm() {
        if (!this.zza.zzL()) {
            zzn();
        }
    }

    public void zzn() {
        zzagk zzw = this.zzb.zzw();
        zza(zzw, this.zza);
        this.zza = zzw;
    }
}
