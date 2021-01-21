package br.com.zup.bff.controller

import br.com.zup.bff.service.ScreenBeagleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ScreenController(
  private val screenBeagleService: ScreenBeagleService
) {
  @GetMapping("/screen")
  fun getFirstScreen() = screenBeagleService.createScreenBeagle()

  @GetMapping("/confirm")
  fun getConfirmScreen() = screenBeagleService.createScreenConfirm()

  @GetMapping("/success")
  fun getSuccssScreen() = screenBeagleService.createScreenSuccess()

}
