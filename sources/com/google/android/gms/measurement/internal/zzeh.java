package com.google.android.gms.measurement.internal;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.internal.measurement.zzod;
import com.google.android.gms.internal.measurement.zzog;
import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.internal.measurement.zzom;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpb;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpk;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpq;
import com.google.android.gms.internal.measurement.zzpt;
import com.google.android.gms.internal.measurement.zzpw;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqc;
import com.google.android.gms.internal.measurement.zzqf;
import com.google.android.gms.internal.measurement.zzqi;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.internal.measurement.zzqo;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.internal.measurement.zzqx;
import com.google.android.gms.internal.measurement.zzra;
import com.google.android.gms.internal.measurement.zzrd;
import com.google.android.gms.internal.measurement.zzrg;
import com.google.android.gms.internal.measurement.zzrj;
import com.google.android.gms.internal.measurement.zzrm;
import com.google.android.gms.search.SearchAuth;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzeh {
    public static final zzeg zzA;
    public static final zzeg zzB;
    public static final zzeg zzC;
    public static final zzeg zzD;
    public static final zzeg zzE;
    public static final zzeg zzF;
    public static final zzeg zzG;
    public static final zzeg zzH;
    public static final zzeg zzI;
    public static final zzeg zzJ;
    public static final zzeg zzK;
    public static final zzeg zzL;
    public static final zzeg zzM;
    public static final zzeg zzN;
    public static final zzeg zzO;
    public static final zzeg zzP;
    public static final zzeg zzQ;
    public static final zzeg zzR;
    public static final zzeg zzS;
    public static final zzeg zzT;
    public static final zzeg zzU;
    public static final zzeg zzV;
    public static final zzeg zzW;
    public static final zzeg zzX;
    public static final zzeg zzY;
    public static final zzeg zzZ;
    public static final zzeg zzaA;
    public static final zzeg zzaB;
    public static final zzeg zzaC;
    public static final zzeg zzaD;
    public static final zzeg zzaE;
    public static final zzeg zzaF;
    public static final zzeg zzaG;
    public static final zzeg zzaH;
    public static final zzeg zzaa;
    public static final zzeg zzab;
    public static final zzeg zzac;
    public static final zzeg zzad;
    public static final zzeg zzae;
    public static final zzeg zzaf;
    public static final zzeg zzag;
    public static final zzeg zzah;
    public static final zzeg zzai;
    public static final zzeg zzaj;
    public static final zzeg zzak;
    public static final zzeg zzal;
    public static final zzeg zzam;
    public static final zzeg zzan;
    public static final zzeg zzao;
    public static final zzeg zzap;
    public static final zzeg zzaq;
    public static final zzeg zzar;
    public static final zzeg zzas;
    public static final zzeg zzat;
    public static final zzeg zzau;
    public static final zzeg zzav;
    public static final zzeg zzaw;
    public static final zzeg zzax;
    public static final zzeg zzay;
    public static final zzeg zzaz;
    public static final zzeg zzj;
    public static final zzeg zzk;
    public static final zzeg zzl;
    public static final zzeg zzm;
    public static final zzeg zzn;
    public static final zzeg zzo;
    public static final zzeg zzp;
    public static final zzeg zzq;
    public static final zzeg zzr;
    public static final zzeg zzs;
    public static final zzeg zzt;
    public static final zzeg zzu;
    public static final zzeg zzv;
    public static final zzeg zzw;
    public static final zzeg zzx;
    public static final zzeg zzy;
    public static final zzeg zzz;
    private static final List zzaI = Collections.synchronizedList(new ArrayList());
    private static final Set zzaJ = Collections.synchronizedSet(new HashSet());
    public static final zzeg zza = zza("measurement.ad_id_cache_time", 10000L, 10000L, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbj
        @Override // com.google.android.gms.measurement.internal.zzed
        public final Object zza() {
            zzeg zzegVar = zzeh.zza;
            return Long.valueOf(zzoj.zzb());
        }
    });
    public static final zzeg zzb = zza("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, 3600000L, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbb
        @Override // com.google.android.gms.measurement.internal.zzed
        public final Object zza() {
            zzeg zzegVar = zzeh.zza;
            return Long.valueOf(zzoj.zzc());
        }
    });
    public static final zzeg zzc = zza("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbn
        @Override // com.google.android.gms.measurement.internal.zzed
        public final Object zza() {
            zzeg zzegVar = zzeh.zza;
            return Long.valueOf(zzoj.zzn());
        }
    });
    public static final zzeg zzd = zza("measurement.config.cache_time", 86400000L, 3600000L, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbz
        @Override // com.google.android.gms.measurement.internal.zzed
        public final Object zza() {
            zzeg zzegVar = zzeh.zza;
            return Long.valueOf(zzoj.zze());
        }
    });
    public static final zzeg zze = zza("measurement.config.url_scheme", "https", "https", new zzed() { // from class: com.google.android.gms.measurement.internal.zzcl
        @Override // com.google.android.gms.measurement.internal.zzed
        public final Object zza() {
            zzeg zzegVar = zzeh.zza;
            return zzoj.zzM();
        }
    });
    public static final zzeg zzf = zza("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new zzed() { // from class: com.google.android.gms.measurement.internal.zzcx
        @Override // com.google.android.gms.measurement.internal.zzed
        public final Object zza() {
            zzeg zzegVar = zzeh.zza;
            return zzoj.zzL();
        }
    });
    public static final zzeg zzg = zza("measurement.upload.max_bundles", 100, 100, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdj
        @Override // com.google.android.gms.measurement.internal.zzed
        public final Object zza() {
            zzeg zzegVar = zzeh.zza;
            return Integer.valueOf((int) zzoj.zzy());
        }
    });
    public static final zzeg zzh = zza("measurement.upload.max_batch_size", 65536, 65536, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdv
        @Override // com.google.android.gms.measurement.internal.zzed
        public final Object zza() {
            zzeg zzegVar = zzeh.zza;
            return Integer.valueOf((int) zzoj.zzG());
        }
    });
    public static final zzeg zzi = zza("measurement.upload.max_bundle_size", 65536, 65536, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdz
        @Override // com.google.android.gms.measurement.internal.zzed
        public final Object zza() {
            zzeg zzegVar = zzeh.zza;
            return Integer.valueOf((int) zzoj.zzx());
        }
    });

    static {
        Integer valueOf = Integer.valueOf(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
        zzj = zza("measurement.upload.max_events_per_bundle", valueOf, valueOf, new zzed() { // from class: com.google.android.gms.measurement.internal.zzea
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Integer.valueOf((int) zzoj.zzB());
            }
        });
        zzk = zza("measurement.upload.max_events_per_day", 100000, 100000, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbu
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Integer.valueOf((int) zzoj.zzC());
            }
        });
        zzl = zza("measurement.upload.max_error_events_per_day", valueOf, valueOf, new zzed() { // from class: com.google.android.gms.measurement.internal.zzcf
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Integer.valueOf((int) zzoj.zzA());
            }
        });
        zzm = zza("measurement.upload.max_public_events_per_day", 50000, 50000, new zzed() { // from class: com.google.android.gms.measurement.internal.zzcq
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Integer.valueOf((int) zzoj.zzD());
            }
        });
        Integer valueOf2 = Integer.valueOf(SearchAuth.StatusCodes.AUTH_DISABLED);
        zzn = zza("measurement.upload.max_conversions_per_day", valueOf2, valueOf2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdb
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Integer.valueOf((int) zzoj.zzz());
            }
        });
        zzo = zza("measurement.upload.max_realtime_events_per_day", 10, 10, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdm
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Integer.valueOf((int) zzoj.zzF());
            }
        });
        zzp = zza("measurement.store.max_stored_events_per_app", 100000, 100000, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdx
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Integer.valueOf((int) zzoj.zzh());
            }
        });
        zzq = zza("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new zzed() { // from class: com.google.android.gms.measurement.internal.zzeb
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return zzoj.zzN();
            }
        });
        zzr = zza("measurement.upload.backoff_period", 43200000L, 43200000L, new zzed() { // from class: com.google.android.gms.measurement.internal.zzec
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Long.valueOf(zzoj.zzu());
            }
        });
        zzs = zza("measurement.upload.window_interval", 3600000L, 3600000L, new zzed() { // from class: com.google.android.gms.measurement.internal.zzaz
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Long.valueOf(zzoj.zzJ());
            }
        });
        zzt = zza("measurement.upload.interval", 3600000L, 3600000L, new zzed() { // from class: com.google.android.gms.measurement.internal.zzba
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Long.valueOf(zzoj.zzw());
            }
        });
        zzu = zza("measurement.upload.realtime_upload_interval", 10000L, 10000L, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbc
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Long.valueOf(zzoj.zzo());
            }
        });
        zzv = zza("measurement.upload.debug_upload_interval", 1000L, 1000L, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbd
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Long.valueOf(zzoj.zzf());
            }
        });
        zzw = zza("measurement.upload.minimum_delay", 500L, 500L, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbe
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Long.valueOf(zzoj.zzm());
            }
        });
        zzx = zza("measurement.alarm_manager.minimum_interval", 60000L, 60000L, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbf
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Long.valueOf(zzoj.zzl());
            }
        });
        zzy = zza("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbg
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Long.valueOf(zzoj.zzr());
            }
        });
        zzz = zza("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbh
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Long.valueOf(zzoj.zzp());
            }
        });
        zzA = zza("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbi
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Long.valueOf(zzoj.zzv());
            }
        });
        zzB = zza("measurement.upload.retry_time", 1800000L, 1800000L, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbk
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Long.valueOf(zzoj.zzI());
            }
        });
        zzC = zza("measurement.upload.retry_count", 6, 6, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbl
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Integer.valueOf((int) zzoj.zzH());
            }
        });
        zzD = zza("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbm
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Long.valueOf(zzoj.zzE());
            }
        });
        zzE = zza("measurement.lifetimevalue.max_currency_tracked", 4, 4, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbo
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Integer.valueOf((int) zzoj.zzg());
            }
        });
        zzF = zza("measurement.audience.filter_result_max_count", 200, 200, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbp
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Integer.valueOf((int) zzoj.zzj());
            }
        });
        zzG = zza("measurement.upload.max_public_user_properties", 25, 25, null);
        zzH = zza("measurement.upload.max_event_name_cardinality", 500, 500, null);
        zzI = zza("measurement.upload.max_public_event_params", 25, 25, null);
        zzJ = zza("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbq
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Long.valueOf(zzoj.zzq());
            }
        });
        Boolean bool = Boolean.FALSE;
        zzK = zza("measurement.test.boolean_flag", bool, bool, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbr
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzpz.zzg());
            }
        });
        zzL = zza("measurement.test.string_flag", "---", "---", new zzed() { // from class: com.google.android.gms.measurement.internal.zzbs
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return zzpz.zzf();
            }
        });
        zzM = zza("measurement.test.long_flag", -1L, -1L, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbt
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Long.valueOf(zzpz.zzd());
            }
        });
        zzN = zza("measurement.test.int_flag", -2, -2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbv
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Integer.valueOf((int) zzpz.zzc());
            }
        });
        Double valueOf3 = Double.valueOf(-3.0d);
        zzO = zza("measurement.test.double_flag", valueOf3, valueOf3, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbw
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Double.valueOf(zzpz.zzb());
            }
        });
        zzP = zza("measurement.experiment.max_ids", 50, 50, new zzed() { // from class: com.google.android.gms.measurement.internal.zzbx
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Integer.valueOf((int) zzoj.zzi());
            }
        });
        zzQ = zza("measurement.upload.max_item_scoped_custom_parameters", 27, 27, new zzed() { // from class: com.google.android.gms.measurement.internal.zzby
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Integer.valueOf((int) zzoj.zzk());
            }
        });
        zzR = zza("measurement.max_bundles_per_iteration", 100, 100, new zzed() { // from class: com.google.android.gms.measurement.internal.zzca
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Integer.valueOf((int) zzoj.zzd());
            }
        });
        zzS = zza("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new zzed() { // from class: com.google.android.gms.measurement.internal.zzcb
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Long.valueOf(zzoj.zzs());
            }
        });
        zzT = zza("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, new zzed() { // from class: com.google.android.gms.measurement.internal.zzcc
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Long.valueOf(zzoj.zzt());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        zzU = zza("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzcd
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzqc.zzc());
            }
        });
        zzV = zza("measurement.quality.checksum", bool, bool, null);
        zzW = zza("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new zzed() { // from class: com.google.android.gms.measurement.internal.zzce
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzov.zze());
            }
        });
        zzX = zza("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new zzed() { // from class: com.google.android.gms.measurement.internal.zzcg
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzov.zzd());
            }
        });
        zzY = zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new zzed() { // from class: com.google.android.gms.measurement.internal.zzch
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzov.zzf());
            }
        });
        zzZ = zza("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzci
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzrj.zzc());
            }
        });
        zzaa = zza("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new zzed() { // from class: com.google.android.gms.measurement.internal.zzcj
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzpq.zzc());
            }
        });
        zzab = zza("measurement.lifecycle.app_in_background_parameter", bool, bool, new zzed() { // from class: com.google.android.gms.measurement.internal.zzck
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzpt.zzc());
            }
        });
        zzac = zza("measurement.integration.disable_firebase_instance_id", bool, bool, new zzed() { // from class: com.google.android.gms.measurement.internal.zzcm
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzrg.zzd());
            }
        });
        zzad = zza("measurement.collection.service.update_with_analytics_fix", bool, bool, new zzed() { // from class: com.google.android.gms.measurement.internal.zzcn
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzrm.zzc());
            }
        });
        zzae = zza("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzco
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzos.zzd());
            }
        });
        zzaf = zza("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzcp
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzpe.zzd());
            }
        });
        zzag = zza("measurement.collection.synthetic_data_mitigation", bool, bool, new zzed() { // from class: com.google.android.gms.measurement.internal.zzcr
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzrd.zzc());
            }
        });
        zzah = zza("measurement.service.storage_consent_support_version", 203600, 203600, new zzed() { // from class: com.google.android.gms.measurement.internal.zzcs
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Integer.valueOf((int) zzom.zzb());
            }
        });
        zzai = zza("measurement.client.click_identifier_control.dev", bool, bool, new zzed() { // from class: com.google.android.gms.measurement.internal.zzct
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzod.zzc());
            }
        });
        zzaj = zza("measurement.service.click_identifier_control", bool, bool, new zzed() { // from class: com.google.android.gms.measurement.internal.zzcu
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzog.zzc());
            }
        });
        zzak = zza("measurement.service.store_null_safelist", bool2, bool2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzcv
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzop.zzd());
            }
        });
        zzal = zza("measurement.service.store_safelist", bool2, bool2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzcw
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzop.zze());
            }
        });
        zzam = zza("measurement.collection.enable_session_stitching_token.first_open_fix", bool2, bool2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzcy
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzqr.zze());
            }
        });
        zzan = zza("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzcz
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzqr.zzd());
            }
        });
        zzao = zza("measurement.session_stitching_token_enabled", bool, bool, new zzed() { // from class: com.google.android.gms.measurement.internal.zzda
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzqr.zzf());
            }
        });
        zzap = zza("measurement.sgtm.client.dev", bool, bool, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdc
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzra.zzd());
            }
        });
        zzaq = zza("measurement.sgtm.service", bool, bool, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdd
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzra.zze());
            }
        });
        zzar = zza("measurement.redaction.retain_major_os_version", bool2, bool2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzde
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzqi.zzc());
            }
        });
        zzas = zza("measurement.redaction.scion_payload_generator", bool2, bool2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdf
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzqi.zzd());
            }
        });
        zzat = zza("measurement.service.clear_global_params_on_uninstall", bool2, bool2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdg
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzph.zzd());
            }
        });
        zzau = zza("measurement.sessionid.enable_client_session_id", bool2, bool2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdh
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzqo.zzd());
            }
        });
        zzav = zza("measurement.sfmc.client", bool2, bool2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdi
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzqx.zzd());
            }
        });
        zzaw = zza("measurement.sfmc.service", bool2, bool2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdk
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzqx.zze());
            }
        });
        zzax = zza("measurement.gmscore_feature_tracking", bool2, bool2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdl
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzpk.zzd());
            }
        });
        zzay = zza("measurement.fix_health_monitor_stack_trace", bool2, bool2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdn
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzpb.zzd());
            }
        });
        zzaz = zza("measurement.item_scoped_custom_parameters.client", bool2, bool2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdo
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzpn.zzd());
            }
        });
        zzaA = zza("measurement.item_scoped_custom_parameters.service", bool, bool, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdp
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzpn.zze());
            }
        });
        zzaB = zza("measurement.remove_app_background.client", bool, bool, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdq
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzql.zzd());
            }
        });
        zzaC = zza("measurement.rb.attribution.service", bool, bool, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdr
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzqf.zzc());
            }
        });
        zzaD = zza("measurement.collection.client.log_target_api_version", bool2, bool2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzds
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                return Boolean.valueOf(zzpw.zzd());
            }
        });
        zzaE = zza("measurement.collection.service.log_target_api_version", bool2, bool2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdt
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                return Boolean.valueOf(zzpw.zze());
            }
        });
        zzaF = zza("measurement.client.deep_link_referrer_fix", bool2, bool2, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdu
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                return Boolean.valueOf(zzoy.zzd());
            }
        });
        zzaG = zza("measurement.client.sessions.enable_fix_background_engagement", bool, bool, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdw
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                return Boolean.valueOf(zzqu.zzc());
            }
        });
        zzaH = zza("measurement.link_sst_to_sid", bool, bool, new zzed() { // from class: com.google.android.gms.measurement.internal.zzdy
            @Override // com.google.android.gms.measurement.internal.zzed
            public final Object zza() {
                zzeg zzegVar = zzeh.zza;
                return Boolean.valueOf(zzqr.zzg());
            }
        });
    }

    public static zzeg zza(String str, Object obj, Object obj2, zzed zzedVar) {
        zzeg zzegVar = new zzeg(str, obj, obj2, zzedVar, null);
        zzaI.add(zzegVar);
        return zzegVar;
    }
}
