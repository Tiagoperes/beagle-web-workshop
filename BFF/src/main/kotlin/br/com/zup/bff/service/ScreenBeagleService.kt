package br.com.zup.bff.service

import br.com.zup.bff.builder.ScreenBeagleBuilder
import br.com.zup.bff.builder.ScreenConfirm
import br.com.zup.bff.builder.ScreenSuccess
import org.springframework.stereotype.Service

@Service
class ScreenBeagleService {
  fun createScreenBeagle() = ScreenBeagleBuilder
  fun createScreenConfirm() = ScreenConfirm
  fun createScreenSuccess() = ScreenSuccess
}