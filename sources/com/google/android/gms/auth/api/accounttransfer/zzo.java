package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import nn.d;
import t.f;
import t.j0;

@SafeParcelable.Class(creator = "AccountTransferProgressCreator")
/* loaded from: classes2.dex */
public class zzo extends zzaz {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    private static final f zzbe;

    @SafeParcelable.Field(getter = "getRegisteredAccountTypes", id = 2)
    private List<String> zzbf;

    @SafeParcelable.Field(getter = "getInProgressAccountTypes", id = 3)
    private List<String> zzbg;

    @SafeParcelable.Field(getter = "getSuccessAccountTypes", id = 4)
    private List<String> zzbh;

    @SafeParcelable.Field(getter = "getFailedAccountTypes", id = 5)
    private List<String> zzbi;

    @SafeParcelable.Field(getter = "getEscrowedAccountTypes", id = 6)
    private List<String> zzbj;

    @SafeParcelable.VersionField(id = 1)
    private final int zzv;

    /* JADX WARN: Type inference failed for: r0v1, types: [t.j0, t.f] */
    static {
        ?? j0Var = new j0();
        zzbe = j0Var;
        j0Var.put("registered", FastJsonResponse.Field.forStrings("registered", 2));
        j0Var.put("in_progress", FastJsonResponse.Field.forStrings("in_progress", 3));
        j0Var.put("success", FastJsonResponse.Field.forStrings("success", 4));
        j0Var.put("failed", FastJsonResponse.Field.forStrings("failed", 5));
        j0Var.put("escrowed", FastJsonResponse.Field.forStrings("escrowed", 6));
    }

    public zzo() {
        this.zzv = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        return zzbe;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public Object getFieldValue(FastJsonResponse.Field field) {
        switch (field.getSafeParcelableFieldId()) {
            case 1:
                return Integer.valueOf(this.zzv);
            case 2:
                return this.zzbf;
            case 3:
                return this.zzbg;
            case 4:
                return this.zzbh;
            case 5:
                return this.zzbi;
            case 6:
                return this.zzbj;
            default:
                throw new IllegalStateException(d.h(37, "Unknown SafeParcelable id=", field.getSafeParcelableFieldId()));
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean isFieldSet(FastJsonResponse.Field field) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public void setStringsInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<String> arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 2) {
            if (safeParcelableFieldId != 3) {
                if (safeParcelableFieldId != 4) {
                    if (safeParcelableFieldId != 5) {
                        if (safeParcelableFieldId == 6) {
                            this.zzbj = arrayList;
                            return;
                        }
                        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(safeParcelableFieldId)));
                    }
                    this.zzbi = arrayList;
                    return;
                }
                this.zzbh = arrayList;
                return;
            }
            this.zzbg = arrayList;
            return;
        }
        this.zzbf = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzv);
        SafeParcelWriter.writeStringList(parcel, 2, this.zzbf, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzbg, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.zzbh, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzbi, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzbj, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) List<String> list, @SafeParcelable.Param(id = 3) List<String> list2, @SafeParcelable.Param(id = 4) List<String> list3, @SafeParcelable.Param(id = 5) List<String> list4, @SafeParcelable.Param(id = 6) List<String> list5) {
        this.zzv = i10;
        this.zzbf = list;
        this.zzbg = list2;
        this.zzbh = list3;
        this.zzbi = list4;
        this.zzbj = list5;
    }
}
